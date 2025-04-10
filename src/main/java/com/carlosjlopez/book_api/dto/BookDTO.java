package com.carlosjlopez.book_api.dto;

/**
 * Data Transfer Object for Book-related data.
 * <p>
 * Used to encapsulate the title and author fields sent by clients when creating or updating a book.
 * This class helps decouple the API layer from the internal Book model.
 * </p>
 */
public class BookDTO {

    private String title;
    private String author;

    public BookDTO(){

    }

    public BookDTO(String title, String author){
        this.title = title;
        this.author = author;
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
