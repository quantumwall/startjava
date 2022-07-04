package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    private int num1;
    private int num2;
    private char sign;
    
    public double calculate(String exp) {
        String[] expArr = exp.split(" ");
        num1 = Integer.parseInt(expArr[0]);
        num2 = Integer.parseInt(expArr[2]);
        sign = expArr[1].charAt(0);
        switch(sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '%':
                return num1 % num2;
            case '^':
                return Math.pow(num1, num2);
        }
        return 0;
    }
}
