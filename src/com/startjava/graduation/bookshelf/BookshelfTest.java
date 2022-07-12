package com.startjava.graduation.bookshelf;

import java.util.Objects;
import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var bookshelf = new Bookshelf();
        var mainMenu = """
                      \n1. Добавить книгу
                      2. Удалить книгу
                      3. Найти книгу
                      4. Всего книг на полке
                      5. Свободного места на полке
                      0. Выход
                      """;
        var addMenu = """
                      \nДобавить книгу
                      <Автор>, <Название книги>, <Год издания> Enter
                      0. Отмена
                      """;
        var deleteMenu = """
                         \nУдалить книгу
                         <Название книги> Enter
                         0. Отмена
                         """;
        var searchMenu = """
                         \nНайти книгу
                         <Название книги> Enter
                         0. Отмена
                         """;
        System.out.println(mainMenu);
        System.out.println(bookshelf);
        System.out.print("Выберите пункт меню: ");
        var choice = input.nextLine();
        while(!choice.equals("0")) {
            switch(choice) {
                case "1" -> {
                    System.out.println(addMenu);
                    choice = input.nextLine();
                    if(choice.equals("0")) {
                        break;
                    }
                    try {
                        bookshelf.addBook(choice);
                    } catch(NumberFormatException e) {
                        System.out.println("Год публикации должен быть числом");
                    } catch(ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case "2" -> {
                    System.out.println(deleteMenu);
                    choice = input.nextLine();
                    if(choice.equals("0")) {
                        break;
                    }
                    try {
                        bookshelf.deleteBook(choice);
                    } catch(ArrayIndexOutOfBoundsException e) {
                        System.out.println("Книга не найдена");
                    }
                }
                case "3" -> {
                    System.out.println(searchMenu);
                    choice = input.nextLine();
                    if(choice.equals("0")) {
                        break;
                    }
                    System.out.println(Objects.requireNonNullElse(bookshelf.searchBook(choice), "Книга не найдена"));
                }
                case "4" -> System.out.printf("Книг на полке - %d\n", bookshelf.booksOnShelf());
                case "5" -> System.out.printf("Свободного места на полке - %d\n", bookshelf.freeSpace());
            };
            System.out.println(mainMenu);
            System.out.println(bookshelf);
            System.out.print("Выберите пункт меню: ");
            choice = input.nextLine();
        }
        input.close();
    }
}
