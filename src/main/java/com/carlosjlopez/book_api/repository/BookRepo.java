package com.carlosjlopez.book_api.repository;

import com.carlosjlopez.book_api.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * This class acts as an in-memory database for the application
 */
@Repository
public class BookRepo {

    private List<Book> books = new ArrayList<Book>();


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void deleteById(long id) {
        books.removeIf((book) -> book.getId() == id);
    }
}
