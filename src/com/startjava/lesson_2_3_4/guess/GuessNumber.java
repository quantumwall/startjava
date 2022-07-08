package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    
    private final Player player1;
    private final Player player2;
    private int targetNumber;
     
    public GuessNumber(Player p1, Player p2) {
        player1 = p1;
        player2 = p2;
    }

    public void start() {
        initGame(player1, player2);
        System.out.println("У каждого игрока есть 10 попыток, чтобы угадать число");
        Scanner input = new Scanner(System.in);
        targetNumber = (int) (Math.random() * 100 + 1);
        int playerNumber;
        while(true) {
            if(player1.getAttempt() == 10) {
                System.out.println("Попытки закончились. Game over.");
                break;
            }
            if(isGuess(player1, input)) {
                break;
            }
            if(isGuess(player2, input)) {
                break;
            }
        }
        showGameResult(player1, player2);
    }
    
    private void initGame(Player... players) {
        for(Player player : players) {
            player.resetNumbers();
            player.setAttempt(0);
        }
    }
    
    private boolean isGuess(Player player, Scanner input) {
        System.out.printf("Ход игрока %s. Введите число: ", player.getName());
        player.setNumber(input.nextInt(), player.getAttempt());
        int playerNumber = player.getNumber(player.getAttempt());
        player.setAttempt(player.getAttempt() + 1);
        if(playerNumber == targetNumber) {
            System.out.printf("Игрок %s угадал число с %d попытки\n", player.getName(), player.getAttempt());
            return true;
        } else if(playerNumber < targetNumber) {
            System.out.printf("%s: Число %d меньше загаданного\n", player.getName(), playerNumber);
        } else {
            System.out.printf("%s: Число %d больше загаданного\n", player.getName(), playerNumber);
        }
        if(player.getAttempt() + 1 > 9) {
            System.out.printf("У игрока %s закончились попытки\n", player.getName());
        }
        return false;
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
