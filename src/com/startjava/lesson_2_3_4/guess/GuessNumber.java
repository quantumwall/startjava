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
        initGame(player1, player2);
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
        showGameResult(player1, player2);
    }
    
    private void initGame(Player... players) {
        for(Player player : players) {
            player.resetNumbers();
            player.setAttempt(0);
        }
    }
    
    private void showGameResult(Player... players) {
        for(Player player : players) {
            System.out.printf("\nОтветы игрока %s: ", player.getName());
            for(int num : player.getNumbers()) {
                System.out.printf("%d ", num);
            }
        }
        
    }
}
