package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    
    private final Player player1;
    private final Player player2;
     
    public GuessNumber(Player p1, Player p2) {
        player1 = p1;
        player2 = p2;
    }

    public void start() {
        prepareNewGame();
        System.out.println("У каждого игрока есть 10 попыток, чтобы угадать число");
        Scanner input = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 100 + 1);
        int playerNumber;
        int attempt = 0;
        while(true) {
            if(attempt == 10) {
                System.out.println("Попытки закончились. Game over.");
                break;
            }
            System.out.printf("Ход игрока %s. Введите число: ", player1.getName());
            player1.setNumber(input.nextInt(), attempt);
            playerNumber = player1.getNumber(attempt);
            if(playerNumber == targetNumber) {
                System.out.printf("Игрок %s угадал число с %d попытки\n", player1.getName(), attempt + 1);
                player1.setAttempt(attempt + 1);
                break;
            } else if(playerNumber < targetNumber) {
                System.out.printf("%s: Число %d меньше загаданного\n", player1.getName(), playerNumber);
                player1.setAttempt(attempt + 1);
            } else {
                System.out.printf("%s: Число %d больше загаданного\n", player1.getName(), playerNumber);
                player1.setAttempt(attempt + 1);
            }
            if(attempt + 1 > 9) {
                System.out.printf("У игрока %s закончились попытки\n", player1.getName());
            }
            
            System.out.printf("Ход игрока %s. Введите число: ", player2.getName());
            player2.setNumber(input.nextInt(), attempt);
            playerNumber = player2.getNumber(attempt);
            if(playerNumber == targetNumber) {
                System.out.printf("Игрок %s угадал число с %d попытки\n", player2.getName(), attempt + 1);
                player2.setAttempt(attempt + 1);
                break;
            } else if(playerNumber < targetNumber) {
                System.out.printf("%s: Число %d меньше загаданного\n", player2.getName(), playerNumber);
                player2.setAttempt(attempt + 1);
            } else {
                System.out.printf("%s: Число %d больше загаданного\n", player2.getName(), playerNumber);
                player2.setAttempt(attempt + 1);
            }
            if(attempt + 1 > 9) {
                System.out.printf("У игрока %s закончились попытки\n", player2.getName());
            }
            attempt++;
        }
        showGameResult();
    }
    
    private void prepareNewGame() {
        player1.resetNumbers();
        player2.resetNumbers();
        player1.setAttempt(0);
        player2.setAttempt(0);
    }
    
    private void showGameResult() {
        int[] player1Numbers = player1.getNumbers();
        int[] player2Numbers = player2.getNumbers();
        System.out.printf("Ответы игрока %s: ", player1.getName());
        for(int num : player1Numbers) {
            System.out.printf("%d ", num);
        }
        System.out.printf("\nОтветы игрока %s: ", player2.getName());
        for(int num : player2Numbers) {
            System.out.printf("%d ", num);
        }
    }
}
