public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int count = -10;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if(count % 2 == 0) {
                evenSum += count;
            } else {
                oddSum += count;
            }
            count++;
        } while(count <= 21);
        System.out.printf("В промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d\n",
            evenSum, oddSum);

        System.out.println("\n2. Вывод чисел в интервале между (max и min)");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max, min;
        if(num1 >= num2 && num1 >= num3) {
            max = num1;
            if(num2 > num3) {
                min = num3;
            } else {
                min = num2;
            }
        } else if(num2 >= num1 && num2 >= num3) {
            max = num2;
            if(num1 > num3) {
                min = num3;
            } else {
                min = num1;
            }
        } else {
            max = num3;
            if(num1 > num2) {
                min = num2;
            } else {
                min = num1;
            }
        }
        System.out.print("[ ");
        for(int i = max; i >= min; i--) {
            System.out.printf("%d ", i);
        }
        System.out.println("]");

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int reversedNum = 0;
        count = 4;
        int rank = 1000;
        int sum = 0;
        while(rank > 0) {
            int temp = srcNum % 10;
            sum += temp;
            reversedNum += temp * rank;
            rank /= 10;
            srcNum /= 10;
        }
        System.out.printf("Число в обратном порядке %d\nСумма цифр %d\n", reversedNum, sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int start = 1;
        int end = 24;
        int step = 2;
        int columns = 5;
        int numbersToDisplay = ((end / step) + (end % 2));
        int rows = numbersToDisplay / columns + (numbersToDisplay % columns == 0 ? 0 : 1);
        for(int row = 0, num = start; row < rows; row++) {
            for(int col = 0; col < columns; col++, num += 2) {
                if(num > end) {
                    System.out.printf("%2d ", 0);
                } else {
                    System.out.printf("%2d ", num);
                }
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества единиц на четность");
        srcNum = 3141591;
        String strNum = "" + srcNum;
        int ones = 0;
        count = 0;
        while(count < strNum.length()) {
            if(strNum.substring(count, count + 1).equals("1")) {
                ones++;
            }
            count++;
        }
        if(ones % 2 == 0) {
            System.out.printf("Число %d содержит %d (четное) количество единиц\n", srcNum, ones);
        } else {
            System.out.printf("Число %d содержит %d (нечетное) количество единиц\n", srcNum, ones);
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for(int row = 1; row <= 5; row++) {
            System.out.println("*".repeat(10));
        }

        int triangleSide1 = 5;
        while(triangleSide1 > 0) {
            System.out.println("#".repeat(triangleSide1));
            triangleSide1--;
        }

        triangleSide1 = 5;
        count = 1;
        do {
            System.out.println("$".repeat(count));
            if(triangleSide1 <= 3) {
                count--;
            } else {
                count++;
            }
            triangleSide1--;
        } while(triangleSide1 > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec\tChar");
        for(int i = 0; i <= 127; i++) {
            if((i < '0' && i % 2 != 0) ||
                (i >= 'a' && i <= 'z' && i % 2 != 0)) {
                System.out.printf("%3d\t%3c\n", i, i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNum = 1234321;
        strNum = srcNum + "";
        String reversedStrNum = "";
        for(int i = strNum.length() - 1; i >= 0; i--) {
            reversedStrNum += strNum.substring(i, i + 1);
        }
        if(strNum.equals(reversedStrNum)) {
            System.out.printf("Число %d является палиндромом\n", srcNum);
        } else {
            System.out.printf("Число %d не является палиндромом\n", srcNum);
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        srcNum = 123456;
        num1 = srcNum / 1000;
        num2 = srcNum % 1000;
        int sumOfFirstHalf = 0;
        int sumOfSecondHalf = 0;
        rank = 100;
        for(int firstNum = num1, secondNum = num2; rank >= 1; rank /= 10) {
            int temp = firstNum / rank;
            sumOfFirstHalf += temp;
            firstNum -= temp * rank;
            temp = secondNum / rank;
            sumOfSecondHalf += temp;
            secondNum -= temp * rank;
        }
        System.out.printf("Сумма цифр %d = %d\n", num1, sumOfFirstHalf);
        System.out.printf("Сумма цифр %d = %d\n", num2, sumOfSecondHalf);

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("Таблица Пифагора");
        for(int row = 0; row <= 9; row++) {
            for(int col = 1; col <= 9; col++) {
                if(row == 0) {
                    if(col < 2) {
                        System.out.print("   | ");
                    } else {
                        System.out.printf("%2d ", col);
                    }
                } else if(row == 1) {
                    System.out.print("---");
                } else {
                    if(col < 2) {
                        System.out.printf("%2d | ", row);
                    } else {
                        System.out.printf("%2d ", row * col);
                    }
                }
            }
            System.out.println();
        }
    }
}
