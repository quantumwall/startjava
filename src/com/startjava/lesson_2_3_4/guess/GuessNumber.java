package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    
    private int targetNumber;
    private Player[] players;
     
    public GuessNumber(Player... players) {
        this.players = new Player[players.length]; 
        for(int i = 0; i < players.length; i++) {
            this.players[i] = players[i];
        }
    }

    public void start() {
        prepareNewGame();
        int attempt = 0;
        int maxAttempts = 9;
        int playerNumber;
        boolean winner = false;
        System.out.println("У каждого игрока есть 10 попыток, чтобы угадать число");
        Scanner input = new Scanner(System.in);
        targetNumber = (int) (Math.random() * 100 + 1);
        while(true) {
            if(attempt > maxAttempts || winner) {
                System.out.println("Попытки закончились. Game over.");
                break;
            }
            for(Player player : players) {
                System.out.printf("Ход игрока %s. Введите число: ", player.getName());
                player.setNumber(input.nextInt(), attempt);
                playerNumber = player.getNumber(attempt);
                if(playerNumber == targetNumber) {
                    System.out.printf("Игрок %s угадал число с %d попытки\n", player.getName(), attempt + 1);
                    player.setAttempt(attempt + 1);
                    winner = true;
                    break;
                } else if(playerNumber < targetNumber) {
                    System.out.printf("%s: Число %d меньше загаданного\n", player.getName(), playerNumber);
                    player.setAttempt(attempt + 1);
                } else {
                    System.out.printf("%s: Число %d больше загаданного\n", player.getName(), playerNumber);
                    player.setAttempt(attempt + 1);
                }
                if(attempt + 1 > maxAttempts) {
                    System.out.printf("У игрока %s закончились попытки\n", player.getName());
                }
            }
            attempt++;
        }
        showGameResult();
    }
    
    private void prepareNewGame() {
        for(Player player : players) {
            player.resetNumbers();
            player.setAttempt(0);
        }
    }
    
    private void showGameResult() {
        for(Player player : players) {
            int[] nums = player.getNumbers();
            System.out.printf("Ответы игрока %s: ", player.getName());
            for(int num : nums) {
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
    }
}
