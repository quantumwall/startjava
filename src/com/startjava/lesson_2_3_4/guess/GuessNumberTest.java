package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(input.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(input.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String repeat = "no";
        do {
            game.start();
            int[] player1Numbers = player1.getNumbers();
            int[] player2Numbers = player2.getNumbers();
            System.out.printf("Ответы игрока %s\n", player1.getName());
            for(int num : player1Numbers) {
                System.out.printf("%d ", num);
            }
            System.out.printf("\nОтветы игрока %s\n", player2.getName());
            for(int num : player2Numbers) {
                System.out.printf("%d ", num);
            }
            do {
                System.out.print("\nХотите повторить игру? [yes/no]: ");
                repeat = input.nextLine().toLowerCase();
            } while(!repeat.equals("yes") && !repeat.equals("no"));
        } while(repeat.equals("yes"));
        input.close();
    }
}
