package com.carlosjlopez.book_api.controller;

import com.carlosjlopez.book_api.dto.BookDTO;
import com.carlosjlopez.book_api.model.Book;
import com.carlosjlopez.book_api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") long id){
        return bookService.getBookById(id);
    }

    @PostMapping
    public void addBook(@RequestBody BookDTO bookIn){
        Book book = bookService.createBook(bookIn);
        bookService.addBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable("id") long id){
        bookService.deleteBookById(id);
    }
}
