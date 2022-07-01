package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String repeat;
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        do {
            System.out.print("Введите математическое выражение: ");
            String[] statement = input.nextLine().split(" ");
            calculator.setNum1(Integer.parseInt(statement[0]));
            calculator.setSign(statement[1].charAt(0));
            calculator.setNum2(Integer.parseInt(statement[2]));
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
