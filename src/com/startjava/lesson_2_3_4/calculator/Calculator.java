package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(int num1, char sign, int num2) {
        return switch(sign) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> {
                    if(num2 == 0) {
                        throw new ArithmeticException("Деление на 0!");
                    }
                    yield num1 / num2;
                }
                case '%' -> num1 % num2;
                case '^' -> (int) Math.pow(num1, num2);
                default -> throw new ArithmeticException("Некорректный знак " + 
                        "математической операции\n+ - * / % ^");
            };
    }
}
