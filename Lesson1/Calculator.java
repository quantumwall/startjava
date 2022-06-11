public class Calculator {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;
        char operator = '^';
        double result = 0;
        if(operator == '+') {
            result = num1 + num2;
        } else if(operator == '-') {
            result = num1 - num2;
        } else if(operator == '*') {
            result = num1 * num2;
        } else if(operator == '/') {
            result = num1 / num2;
        } else if(operator == '^') {
            result = 1;
            for(int count = 0; count < num2; count++) {
                result *= num1;
            }
        } else if(operator == '%') {
            result = num1 % num2;
        }
        System.out.printf("%d %c %d = %.2f\n", num1, operator, num2, result);
    }
}
