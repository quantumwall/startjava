import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        do {
            System.out.print("Введите первое число: ");
            int num1 = input.nextInt();
            input.nextLine();
            System.out.print("Введите знак математической операции: ");
            String sign = input.nextLine();
            System.out.print("Введите второе число: ");
            int num2 = input.nextInt();
            input.nextLine();
            calculator.setNum1(num1);
            calculator.setNum2(num2);
            calculator.setSign(sign);
            double result = calculator.calculate();
            System.out.printf("Результат вычислений: %.1f\n", result);
            String answer;
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = input.nextLine();
            } while(!answer.equalsIgnoreCase("yes") &&
                    !answer.equalsIgnoreCase("no"));
            repeat = answer.equalsIgnoreCase("yes") ? true : false;
        } while(repeat);
        input.close();
    }
}
