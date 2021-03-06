package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String exp) {
        String[] partsExp = exp.split(" ");
        int num1 = Integer.parseInt(partsExp[0]);
        int num2 = Integer.parseInt(partsExp[2]);
        char sign = partsExp[1].charAt(0);
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
