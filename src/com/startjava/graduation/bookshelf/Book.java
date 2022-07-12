package com.startjava.graduation.bookshelf;

public class Book {
    
    private String author;
    private String title;
    private int year;
    
    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
    
    @Override
    public String toString() {
        return  String.format("%s, %s, %d", author, title, year);
    }
}
