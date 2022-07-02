package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int playersCount = input.nextInt();
        Player[] players = new Player[playersCount];
        input.nextLine();
        for(int i = 0; i < playersCount; i++) {
            System.out.printf("Введите имя игрока %d: ", i + 1);
            players[i] = new Player(input.nextLine());
        }
        GuessNumber game = new GuessNumber(players);
        String repeat = "no";
        do {
            game.start();
            do {
                System.out.print("\nХотите повторить игру? [yes/no]: ");
                repeat = input.nextLine().toLowerCase();
            } while(!repeat.equals("yes") && !repeat.equals("no"));
        } while(repeat.equals("yes"));
        input.close();
    }
}
