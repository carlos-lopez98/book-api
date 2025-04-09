package com.carlosjlopez.book_api.service;

import com.carlosjlopez.book_api.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Class provides main functionality revolving around the book object model
 *
 * @author CJL
 */

@Service
public class BookService {


    //Returns a dummy book for now
    public List<Book> getAllBooks(){
        return List.of(new Book("Microservices", "Sam Newman"));
    }
}
