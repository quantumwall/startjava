package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    
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
        System.out.printf("У каждого игрока есть %d попыток, чтобы угадать число\n", maxAttempts + 1);
        Scanner input = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 100 + 1);
        while(true) {
            if(winner) {
                break;
            }
            if(attempt > maxAttempts) {
                System.out.println("Попытки закончились. Game over.");
                break;
            }
            for(Player player : players) {
                System.out.printf("Ход игрока %s. Введите число: ", player.getName());
                try {
                    player.setNumber(input.nextInt(), attempt);
                    playerNumber = player.getNumber(attempt);
                    if(playerNumber == targetNumber) {
                        System.out.printf("Игрок %s угадал число с %d попытки\n", player.getName(), attempt + 1);
                        player.setAttempt(attempt + 1);
                        winner = true;
                        break;
                    }
                    System.out.printf("%s: число %d %s загаданного\n", player.getName(),
                        playerNumber, playerNumber < targetNumber ? "меньше" : "больше"); 
                } catch(Exception e) {
                    System.out.println(e);
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
