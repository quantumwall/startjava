package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    
    private final Player player1;
    private final Player player2;
    private int targetNumber;
     
    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        initGame(player1, player2);
        System.out.println("У каждого игрока есть 10 попыток, чтобы угадать число");
        Scanner input = new Scanner(System.in);
        targetNumber = (int) (Math.random() * 100 + 1);
        do {
            if(isGuessed(player1, input) || isGuessed(player2, input)) {
                break;
            }
        } while(player2.getAttempt() < 10);
        printGameResult(player1, player2);
    }
    
    private void initGame(Player... players) {
        for(Player player : players) {
            player.resetNumbers();
            player.setAttempt(0);
        }
    }
    
    private boolean isGuessed(Player player, Scanner input) {
        System.out.printf("Ход игрока %s. Введите число: ", player.getName());
        player.addNumber(input.nextInt());
        int playerNumber = player.getNumber();
        if(playerNumber == targetNumber) {
            System.out.printf("Игрок %s угадал число с %d попытки\n", player.getName(), player.getAttempt());
            return true;
        }
        if(playerNumber < targetNumber) {
            System.out.printf("%s: Число %d меньше загаданного\n", player.getName(), playerNumber);
        } else {
            System.out.printf("%s: Число %d больше загаданного\n", player.getName(), playerNumber);
        }
        if(player.getAttempt() > 9) {
            System.out.printf("У игрока %s закончились попытки\n", player.getName());
        }
        return false;
    }
    
    private void printGameResult(Player... players) {
        for(Player player : players) {
            System.out.printf("\nОтветы игрока %s: ", player.getName());
            for(int num : player.getNumbers()) {
                System.out.print(num + " ");
            }
        }
    }
}
