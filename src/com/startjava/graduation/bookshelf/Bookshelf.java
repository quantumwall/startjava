package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    
    private int booksOnShelf;
    private Book[] books;
    private StringBuilder sb = new StringBuilder();
    
    public Bookshelf() {
        booksOnShelf = 0;
        books = new Book[10];
    }
    
    public void addBook(String bookData) {
        String[] bookParts = bookData.split(", ");
        System.out.println(Arrays.toString(bookParts));
        String author = bookParts[0];
        String title = bookParts[1];
        int year = Integer.parseInt(bookParts[2]);
        books[booksOnShelf++] = new Book(author, title, year);
    }
    
    
    public void deleteBook() {
        
    }
    
    public String searchBook(String title) {
        return null;
    }
    
    public int booksOnShelf() {
        return booksOnShelf;
    }
    
    public int freeSpace() {
        return books.length - booksOnShelf;
    }
    
    @Override
    public String toString() {
        sb.delete(0, sb.length());
        for(Book book : books) {
            sb.append("<" + (book != null ? book : " ") + ">\n");
        }
        return sb.toString();
    }
}
