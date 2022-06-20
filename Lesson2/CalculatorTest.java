import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String repeat;
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        do {
            System.out.print("Введите первое число: ");
            int num1 = input.nextInt();
            calculator.setNum1(num1);
            input.nextLine();
            System.out.print("Введите знак математической операции: ");
            char sign = input.nextLine().charAt(0);
            calculator.setSign(sign);
            System.out.print("Введите второе число: ");
            int num2 = input.nextInt();
            calculator.setNum2(num2);
            input.nextLine();
            double result = calculator.calculate();
            System.out.printf("Результат вычислений: %.1f\n", result);
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                repeat = input.nextLine();
            } while(!repeat.equalsIgnoreCase("yes") &&
                    !repeat.equalsIgnoreCase("no"));
        } while(repeat.equalsIgnoreCase("yes"));
        input.close();
    }
}
