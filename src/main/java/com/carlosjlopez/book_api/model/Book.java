package com.carlosjlopez.book_api.model;


/**
 * This class provides a model representation of the book object model
 *
 * @author CJL
 */
public class Book {
    private long id;
    private String title;
    private String author;

    public Book(){

    }
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
