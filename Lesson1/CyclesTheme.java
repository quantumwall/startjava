public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int count = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if(count % 2 == 0) {
                sumEven += count;
            } else {
                sumOdd += count;
            }
            count++;
        } while(count <= 21);
        System.out.printf("В промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d\n",
                sumEven, sumOdd);

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
        for(int i = max - 1; i > min; i--) {
            System.out.printf("%d ", i);
        }
        System.out.println("]");

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int reversedNum = 0;
        int sumDigits = 0;
        while(srcNum > 0) {
            int digit = srcNum % 10;
            sumDigits += digit;
            reversedNum = reversedNum * 10 + digit;
            srcNum /= 10;
        }
        System.out.printf("Число в обратном порядке %d\nСумма цифр %d\n", reversedNum, sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int start = 1;
        int end = 24;
        int step = 2;
        int columns = 5;
        count = 1;
        for(int i = start; i <= end; i += step, count++) {
            if(count == columns) {
                System.out.printf("%2d\n", i);
                count = 0;
            } else {
                System.out.printf("%2d ", i);
            }
        }
        while(count <= columns) {
            System.out.print(" 0 ");
            count++;
        }
        
        System.out.println("\n\n5. Проверка количества единиц на четность");
        srcNum = 3141591;
        int tempNum = srcNum;
        int ones = 0;
        while(tempNum > 0) {
            int digit = tempNum % 10;
            if(digit == 1) {
                ones++;
            }
            tempNum /= 10;
        }
        if(ones % 2 == 0) {
            System.out.printf("Число %d содержит %d (четное) количество единиц\n", srcNum, ones);
        } else {
            System.out.printf("Число %d содержит %d (нечетное) количество единиц\n", srcNum, ones);
        }  

        System.out.println("\n6. Отображение фигур в консоли");
        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <= 10; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int triangleSide1 = 5;
        while(triangleSide1 > 0) {
            count = triangleSide1;
            while(count > 0) {
                System.out.print("#");
                count--;
            }
            System.out.println();
            triangleSide1--;
        }

        triangleSide1 = 5;
        count = 1;
        do {
            int temp = 1;
            do {
                System.out.print("$");
                temp++;
            } while(temp <= count);
            System.out.println();
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
                (i >= 'a' && i <= 'z' && i % 2 == 0)) {
                System.out.printf("%3d\t%3c\n", i, i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNum = 1234321;
        reversedNum = 0;
        tempNum = srcNum;
        while(tempNum > 0) {
            reversedNum = reversedNum * 10 + tempNum % 10;
            tempNum /= 10;
        }
        if(srcNum == reversedNum) {
            System.out.printf("Число %d является палиндромом\n", srcNum);
        } else {
            System.out.printf("Число %d не является палиндромом\n", srcNum);
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        srcNum = 123456;
        num1 = srcNum / 1000;
        num2 = srcNum % 1000;
        int tempNum1 = num1;
        int tempNum2 = num2;
        int sumOfFirstHalf = 0;
        int sumOfSecondHalf = 0;
        while(tempNum1 > 0) {
            int digitNum1 = tempNum1 % 10;
            sumOfFirstHalf += digitNum1;
            tempNum1 /= 10;
            int digitNum2 = tempNum2 % 10;
            sumOfSecondHalf += digitNum2;
            tempNum2 /= 10;
        }
        System.out.printf("Сумма цифр %d = %d\n", num1, sumOfFirstHalf);
        System.out.printf("Сумма цифр %d = %d\n", num2, sumOfSecondHalf);
        if(sumOfFirstHalf == sumOfSecondHalf) {
            System.out.printf("Число %d является \"счастливым\"\n", srcNum);
        } else {
            System.out.printf("Число %d не является \"счастливым\"\n", srcNum);
        }
       
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
