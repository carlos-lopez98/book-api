package com.carlosjlopez.book_api.repository;

import com.carlosjlopez.book_api.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepo {

    public List<Book> books = new ArrayList<Book>();

}
