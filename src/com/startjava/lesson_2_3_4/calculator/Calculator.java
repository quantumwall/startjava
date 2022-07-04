package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String exp) 
            throws ArrayIndexOutOfBoundsException, NumberFormatException {
        String[] expArr = exp.split(" ");
        int num1 = Integer.parseInt(expArr[0]);
        int num2 = Integer.parseInt(expArr[2]);
        char sign = expArr[1].charAt(0);
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
