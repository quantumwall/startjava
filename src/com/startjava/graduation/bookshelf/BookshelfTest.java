package com.startjava.graduation.bookshelf;

import java.util.Objects;
import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var bookshelf = new Bookshelf();
        var menuItem = "";
        do {
            System.out.println("""
                               \n1. Добавить книгу
                               2. Удалить книгу
                               3. Найти книгу
                               4. Всего книг на полке
                               5. Свободного места на полке
                               0. Выход
                               """);
            System.out.println(bookshelf);
            System.out.print("Выберите пункт меню: "); 
            menuItem = input.nextLine();
            switch(menuItem) {
                case "1" -> {
                    System.out.println("""
                                       \nДобавить книгу
                                       <Автор>, <Название книги>, <Год издания> Enter
                                       0. Отмена
                                       """);
                    var subMenuItem = input.nextLine();
                    if(subMenuItem.equals("0")) {
                        break;
                    }
                    var bookParts = subMenuItem.split(", ");
                    try {
                        bookshelf.addBook(new Book(bookParts[0], bookParts[1], Integer.parseInt(bookParts[2])));
                    } catch(NumberFormatException e) {
                        System.out.println("Год издания должен быть строкой");
                    } catch(ArrayIndexOutOfBoundsException e) {
                        System.out.println("Введены не все данные для добавления книги");
                    } catch(Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case "2" -> {
                    System.out.println("""
                                       \nУдалить книгу
                                       <Название книги> Enter
                                       0. Отмена
                                       """);
                    var subMenuItem = input.nextLine();
                    if(subMenuItem.equals("0")) {
                        break;
                    }
                    try {
                        bookshelf.deleteBook(subMenuItem);
                    } catch(ArrayIndexOutOfBoundsException e) {
                        System.out.println("Книга не найдена");
                    } catch(Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case "3" -> {
                    System.out.println("""
                                       \nНайти книгу
                                       <Название книги> Enter
                                       0. Отмена
                                       """);
                    var subMenuItem = input.nextLine();
                    if(subMenuItem.equals("0")) {
                        break;
                    }
                    System.out.println(Objects.requireNonNullElse(bookshelf.searchBook(subMenuItem), "Книга не найдена"));
                }
                case "4" -> System.out.printf("Книг на полке - %d\n", bookshelf.getCount());
                case "5" -> System.out.printf("Свободного места на полке - %d\n", bookshelf.getFreeSpace());
            };
        } while(!menuItem.equals("0"));
        input.close();
    }
}
