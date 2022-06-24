package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String repeat;
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        do {
            System.out.print("Введите первое число: ");
            calculator.setNum1(input.nextInt());
            input.nextLine();
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(input.nextLine().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setNum2(input.nextInt());
            input.nextLine();
            double result = calculator.calculate();
            System.out.printf("Результат вычислений: %.1f\n", result);
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                repeat = input.nextLine().toLowerCase();
            } while(!repeat.equals("yes") &&
                    !repeat.equals("no"));
        } while(repeat.equals("yes"));
        input.close();
    }
}
