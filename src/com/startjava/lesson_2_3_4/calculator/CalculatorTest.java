package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String repeat;
        Scanner input = new Scanner(System.in);
        do {
            String[] expression;
            int num1;
            int num2;
            char sign;
            do {
                try {
                    System.out.print("Введите математическое выражение: ");
                    expression = input.nextLine().split(" ");
                    num1 = Integer.parseInt(expression[0]);
                    num2 = Integer.parseInt(expression[2]);
                    sign = expression[1].charAt(0);
                    System.out.printf("Результат вычислений: %d\n", Calculator.calculate(num1, sign, num2));
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
