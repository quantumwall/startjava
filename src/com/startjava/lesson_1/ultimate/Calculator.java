package com.startjava.lesson_1.ultimate;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;
        char sign = '^';
        double result = 0;
        if(sign == '+') {
            result = num1 + num2;
        } else if(sign == '-') {
            result = num1 - num2;
        } else if(sign == '*') {
            result = num1 * num2;
        } else if(sign == '/') {
            result = num1 / num2;
        } else if(sign == '^') {
            result = 1;
            for(int i = 0; i < num2; i++) {
                result *= num1;
            }
        } else if(sign == '%') {
            result = num1 % num2;
        }
        System.out.printf("%d %c %d = %.2f\n", num1, sign, num2, result);
    }
}
