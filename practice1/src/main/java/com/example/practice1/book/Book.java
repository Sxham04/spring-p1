package com.example.practice1.book;

import java.time.LocalDate;

public class Book {
    private long id;
    private String title;
    private String author;
    private LocalDate releaseDate;

    public Book(String title, String author, LocalDate releaseDate) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
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

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
