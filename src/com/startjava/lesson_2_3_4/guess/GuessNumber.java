package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    
    private int targetNumber;
    private Player player1;
    private Player player2;
     
    public GuessNumber(Player p1, Player p2) {
        player1 = p1;
        player2 = p2;
    }

    public void start() {
        prepareNewGame();
        System.out.println("У каждого игрока есть 10 попыток, чтобы угадать число");
        Scanner input = new Scanner(System.in);
        targetNumber = (int) (Math.random() * 100 + 1);
        int playerNumber;
        int player1Attempt = 0;
        int player2Attempt = 0;
        while(true) {
            if(player1Attempt == 10 && player2Attempt == 10) {
                System.out.println("Попытки закончились. Game over.");
                break;
            }
            
            if(player1Attempt < 10) {
                System.out.printf("Ход игрока %s. Введите число: ", player1.getName());
                player1.setNumber(input.nextInt(), player1Attempt);
                playerNumber = player1.getNumber(player1Attempt);
                if(playerNumber == targetNumber) {
                    System.out.printf("Игрок %s угадал число с %d попытки\n", player1.getName(), player1Attempt + 1);
                    break;
                } else if(playerNumber < targetNumber) {
                    System.out.printf("%s: Число %d меньше загаданного\n", player1.getName(), playerNumber);
                    player1.setAttempt(++player1Attempt);
                } else {
                    System.out.printf("%s: Число %d больше загаданного\n", player1.getName(), playerNumber);
                    player1.setAttempt(++player1Attempt);
                }
            } else {
                System.out.printf("У игрока %s закончились попытки", player1.getName());
            }
            
            if(player2Attempt < 10) {
                System.out.printf("Ход игрока %s. Введите число: ", player2.getName());
                player2.setNumber(input.nextInt(), player2Attempt);
                playerNumber = player2.getNumber(player2Attempt);
                if(playerNumber == targetNumber) {
                    System.out.printf("Игрок %s угадал число с %d попытки\n", player2.getName(), player2Attempt + 1);
                    break;
                } else if(playerNumber < targetNumber) {
                    System.out.printf("%s: Число %d меньше загаданного\n", player2.getName(), playerNumber);
                    player2.setAttempt(++player2Attempt);
                } else {
                    System.out.printf("%s: Число %d больше загаданного\n", player2.getName(), playerNumber);
                    player2.setAttempt(++player2Attempt);
                }
            } else {
                System.out.printf("У игрока %s закончились попытки", player2.getName());
            }
        }
    }
    
    public void prepareNewGame() {
        player1.resetNumbers();
        player2.resetNumbers();
        player1.setAttempt(0);
        player2.setAttempt(0);
    }
}
