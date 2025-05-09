package com.carlosjlopez.book_api.service;

import com.carlosjlopez.book_api.dto.BookDTO;
import com.carlosjlopez.book_api.model.Book;
import com.carlosjlopez.book_api.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Class provides main functionality revolving around the book object model
 *
 * @author CJL
 */

@Service
public class BookService {

    private final BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }


    public List<Book> getAllBooks(){

        return bookRepo.getBooks();
    }


    /**
     * Function is used to return books by id
     *
     * Relies on access to the in-memory repo storage
     * @param id
     * @return Book
     */
    public Book getBookById(long id) {

        Book res = bookRepo.getBooks().stream()
                .filter((x) -> x.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Book not found"));

        return res;
    }


    /**
     * Method provides the ability to add a book into the repository
     * @param book
     */
    public void addBook(Book book) {
        bookRepo.addBook(book);
    }


    /**
     * Method provides the ability to delete a book by the ID
     * @param id
     */
    public void deleteBookById(long id) {

        bookRepo.deleteById(id);
    }


    /**
     * Turns our incoming BookDTO into a workable Book object
     * @param bookIn
     * @return
     */
    public Book createBook(BookDTO bookIn) {
        return new Book(bookIn.getTitle(), bookIn.getAuthor());
    }
}
