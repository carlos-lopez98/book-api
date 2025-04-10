package com.carlosjlopez.book_api.controller;

import com.carlosjlopez.book_api.dto.BookDTO;
import com.carlosjlopez.book_api.model.Book;
import com.carlosjlopez.book_api.service.BookService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing Book resources.
 * <p>
 * Handles HTTP requests related to book creation, retrieval, and other book-related operations.
 * Accepts input as BookDTO and delegates processing to the service layer.
 * </p>
 *
 * Example endpoints:
 * <ul>
 *   <li>POST /books - Create a new book</li>
 *   <li>GET /books/{id} - Retrieve a specific book by ID</li>
 *   <li>GET /books - Retrieves the current books available in the Repo</li>
 * </ul>
 */

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    /**
     * API Method returns all books currently in our database
     * @return
     */
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> books = bookService.getAllBooks();

        ResponseEntity<List<Book>> booksResponse = new ResponseEntity<>(books,HttpStatus.OK);
        return booksResponse;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") long id){

        return new ResponseEntity<>(bookService.getBookById(id), HttpStatus.OK);
    }

    /**
     * Returns the book that was passed in, with a status code of OK if job was completed successfully
     * @param bookIn
     * @return
     */
    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody BookDTO bookIn){
        Book book = bookService.createBook(bookIn);
        bookService.addBook(book);

        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    /**
     * API Method - deletes a book based on the Id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Book> deleteBookById(@PathVariable("id") long id){
        Book deleted = bookService.getBookById(id);

        bookService.deleteBookById(id);
        return new ResponseEntity<>(deleted, HttpStatus.OK);
    }
}
