package com.startjava.graduation.bookshelf;

public class Bookshelf {
    
    private int count;
    private Book[] books = new Book[10];
    
    public void addBook(Book book) {
        if(count >= 10) {
            System.out.println("Не осталось места на полке");
            return;
        }
        books[count++] = book;
    }
    
    public void deleteBook(String title) {
        if(count <= 0) {
            System.out.println("Полка пуста");
            return;
        }
        int delIndex = -1;
        for(int i = 0; i < count; i++) {
            if(books[i].getTitle().equalsIgnoreCase(title)) {
                delIndex = i;
                break;
            }
        }
        if(delIndex < 0) {
            System.out.println("Книга не найдена");
            return;
        }
        System.arraycopy(books, delIndex + 1, books, delIndex, count - 1 - delIndex);
        books[--count] = null;
    }
    
    public Book searchBook(String title) {
        for(int i = 0; i < count; i++) {
            if(books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }
    
    public int getCount() {
        return count;
    }
    
    public int getFreeSpace() {
        return books.length - count;
    }
    
    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.delete(0, sb.length());
        for(Book book : books) {
            sb.append("<" + (book != null ? book : " ") + ">\n");
        }
        return sb.toString();
    }
}
