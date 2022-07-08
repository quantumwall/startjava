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
        //TODO
        //make two kind of exceptions
        //one if not all parts was entered
        //two if free space was ended
        String[] bookParts = bookData.split(", ");
        String author = bookParts[0];
        String title = bookParts[1];
        int year = Integer.parseInt(bookParts[2]);
        books[booksOnShelf++] = new Book(author, title, year);
    }
    
    
    public void deleteBook(String title) {
        int index = -2;
        for(int i = 0; i < booksOnShelf; i++) {
            if(books[i].getTitle().equalsIgnoreCase(title)) {
                index = i;
                break;
            }
        }
        System.arraycopy(books, index + 1, books, index, booksOnShelf-- - index);
    }
    
    public String searchBook(String title) {
        for(int i = 0; i <= booksOnShelf; i++) {
            if(books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i].toString();
            }
        }
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
