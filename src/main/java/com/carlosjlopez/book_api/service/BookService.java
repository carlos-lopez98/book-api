package com.carlosjlopez.book_api.service;

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

    @Autowired
    private BookRepo bookRepo;


    //Returns a dummy book for now
    public List<Book> getAllBooks(){
        return List.of(new Book("Microservices", "Sam Newman"));
    }


    /**
     * Function is used to return books by id
     *
     * Relies on access to the in-memory repo storage
     * @param id
     * @return Book
     */
    public Book getBookById(long id) {
        Book res = bookRepo.books.stream()
                .filter((x) -> x.getId() == id)

        return res;
    }
}
