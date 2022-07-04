package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String repeat;
        Scanner input = new Scanner(System.in);
        do {
            do {
                try {
                    System.out.print("Введите математическое выражение: ");
                    System.out.printf("Результат вычислений: %d\n", Calculator.calculate(input.nextLine()));
                } catch(NumberFormatException e) {
                    System.out.println("Ошибка! Должны быть введены целые числа");
                    continue;
                } catch(ArithmeticException e) {
                    System.out.println("Ошибка! " + e.getMessage());
                    continue;
                } catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println("Ошибка! Введены не все члены математического выражения");
                    System.out.println("Формат: число1 знак число2");
                    continue;
                }
                break;
            } while(true);
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                repeat = input.nextLine().toLowerCase();
            } while(!repeat.equals("yes") && !repeat.equals("no"));
        } while(repeat.equals("yes"));
        input.close();
    }
}
