package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var bookshelf = new Bookshelf();
        var choice = "";
        var mainMenu = """
                      1. Добавить книгу
                      2. Удалить книгу
                      3. Найти книгу
                      4. Всего книг на полке
                      5. Свободного места на полке
                      6. Выход
                      """;
        var addMenu = """
                      Добавить книгу
                      <Автор>, <Название книги>, <Год издания> Enter
                      0. Отмена
                      """;
        var deleteMenu = """
                         Удалить книгу
                         <Название книги> Enter
                         0. Отмена
                         """;
        var searchMenu = """
                         Найти книгу
                         <Название книги> Enter
                         0. Отмена
                         """;
        System.out.println(mainMenu);
        System.out.println(bookshelf);
        System.out.print("Выберите пункт меню: ");
        choice = input.nextLine();
        while(!choice.equals("6")) {
//            switch(choice) {
//                case "1":
//                    System.out.println(addMenu);
//                    String addChoice = input.nextLine();
//                    if(addChoice.equals("0")) {
//                        break;
//                    }
//                    try {
//                        bookshelf.addBook(addChoice);
//                    } catch(NumberFormatException e) {
//                        System.out.println("Год выпуска должен быть числом");
//                    } catch(ArrayIndexOutOfBoundsException e) {
//                        System.out.println("На полке не осталось свободного места");
//                    }
//                    break;
//                
//            }
            
            switch(choice) {
                case "1" -> {
                    System.out.println(addMenu);
                    String addChoice = input.nextLine();
                    if(addChoice.equals(0)) {
                        break;
                    }
                    try {
                        bookshelf.addBook(addChoice);
                    } catch(NumberFormatException e) {
                        System.out.println("Год выпуска должен быть числом");
                    } catch(ArrayIndexOutOfBoundsException e) {
                        System.out.println("На полке не осталось свободного места");
                    }
                }
                case "2" -> {
                    System.out.println(deleteMenu);
                    String delChoice = input.nextLine();
                    if(delChoice.equals("0")) {
                        break;
                    }
                }
                case "4" -> System.out.printf("Книг на полке - %d\n", bookshelf.booksOnShelf());
                case "5" -> System.out.printf("Свободного места на полке - %d\n", bookshelf.freeSpace());
            };
            System.out.println(mainMenu);
            System.out.println(bookshelf);
            System.out.print("Выберите пункт меню: ");
            choice = input.nextLine();
        }
    }
}
