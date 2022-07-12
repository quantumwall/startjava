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
        if(booksOnShelf >= 10) {
            throw new ArrayIndexOutOfBoundsException("Не осталось места на полке");
        }
        try {
            String[] bookParts = bookData.split(", ");
            String author = bookParts[0];
            String title = bookParts[1];
            int year = Integer.parseInt(bookParts[2]);
            books[booksOnShelf++] = new Book(author, title, year);
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Введены не все данные для добавления книги");
        }
        
    }
    
    
    public void deleteBook(String title) {
        int delIndex = -1;
        for(int i = 0; i < booksOnShelf; i++) {
            if(books[i].getTitle().equalsIgnoreCase(title)) {
                delIndex = i;
                break;
            }
        }
        System.arraycopy(books, delIndex + 1, books, delIndex, --booksOnShelf - delIndex);
        Arrays.fill(books, booksOnShelf, books.length, null);
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
