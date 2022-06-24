package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 30;
        boolean isMale = true;
        double height = 1.80;
        String name = "Ricardo";
        if(age > 20) {
            System.out.println("Возраст больше 20 лет");
        } else {
            System.out.println("Возраст меньше или равен 20 годам");
        }

        if(!isMale) {
            System.out.println("Пол женский");
        }

        if(height < 1.80) {
            System.out.println("Рост меньше 1,80 метра");
        } else {
            System.out.println("Рост больше или равен 1,80 метра");
        }

        char nameFirstLetter = name.charAt(0);
        if(nameFirstLetter == 'M') {
            System.out.printf("Имя начинается на %с\n", nameFirstLetter);
        } else if(nameFirstLetter == 'I') {
            System.out.printf("Имя начинается на %c\n", nameFirstLetter);
        } else {
            System.out.println("Имя начинается на букву которую мы не ожидали");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 34;
        int num2 = 3;
        if(num1 > num2) {
            System.out.printf("Максимальное число - %d\nМинимальное число - %d\n", num1, num2);
        } else if(num1 < num2) {
            System.out.printf("Максимальное число - %d\nМинимальное число - %d\n", num2, num1);
        } else {
            System.out.printf("%1$.2f равно %1$.2f\n", num1);
        }

        System.out.println("\n3. Работа с числом");
        int srcNum = 1612;
        if(srcNum != 0) {
            if(srcNum > 0) {
                System.out.printf("Число %d положительное\n", srcNum);
            } else {
                System.out.printf("Число %d отрицательное\n", srcNum);
            }

            if(srcNum % 2 == 0) {
                System.out.printf("Число %d четное\n", srcNum);
            } else {
                System.out.printf("Число %d нечетное\n", srcNum);
            }
        } else {
            System.out.printf("Число %d это ноль\n", srcNum);
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 204;
        num2 = 224;
        boolean isHundredsEquals = (num1 / 100) == (num2 / 100);
        boolean isDozensEquals = (num1 % 100 / 10) == (num2 % 100 / 10);
        boolean isOnesEquals = (num1 % 100 % 10) == (num2 % 100 % 10);
        if(isHundredsEquals) {
            int hundreds = num1 / 100;
            System.out.printf("В числах %d и %d одинаковые цифры %d в разрядах сотен\n",
                num1, num2, hundreds);
        }
        if(isDozensEquals) {
            int dozens = num1 % 100 / 10;
            System.out.printf("В числах %d и %d одинаковые цифры %d в разрядах десятков\n",
                num1, num2, dozens);
        }
        if(isOnesEquals) {
            int ones = num1 % 100 % 10;
            System.out.printf("В числах %d и %d одинаковые цифры %d в разрядах единиц\n",
                num1, num2, ones);
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char character = '\u0057';
        if(character >= 'A' && character <= 'Z') {
            System.out.printf("%c большая буква\n", character);
        } else if(character >= 'a' && character <= 'z') {
            System.out.printf("%c маленькая буква\n", character);
        } else if(character >= '0' && character <= '9') {
            System.out.printf("%c - цифра\n", character);
        } else {
            System.out.printf("%c не буква и не цифра\n", character);
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        int rate;
        if(deposit < 100000) {
            rate = 5;
        } else if(deposit >= 100000 && deposit <= 300000) {
            rate = 7;
        } else {
            rate = 10;
        }
        double depositWithInterest = deposit + (deposit * (rate / 100.0));
        System.out.printf("Сумма вклада - %d руб.\n", deposit);
        System.out.printf("Процентная ставка - %d%%\n", rate);
        System.out.printf("Итоговая сумма - %.2f руб.\n", depositWithInterest);

        System.out.println("\n7. Определение оценки по предметам");
        int historyRate = 59;
        int programRate= 91;
        int historyScore = 0;
        int programScore = 0;
        if(historyRate <= 60) {
            historyScore = 2;
        } else if(historyRate > 91) {
            historyScore = 5;
        } else if(historyRate > 73) {
            historyScore = 4;
        } else if(historyRate > 60) {
            historyScore = 3;
        }

        if(programRate <= 60) {
            programScore = 2;
        } else if(programRate > 91) {
            programScore = 5;
        } else if(programRate > 73) {
            programScore = 4;
        } else if(programRate > 60) {
            programScore = 3;
        }
        System.out.printf("%d история \n", historyScore);
        System.out.printf("%d программирование\n", programScore);
        System.out.printf("Средний балл оценок по предметам - %d баллов\n", (historyScore + programScore) / 2);
        System.out.printf("Средний %% по предметам - %.1f%%\n", (historyRate + programRate) / 2.0);

        System.out.println("\n8. Расчет прибыли");
        int rentPrice = 5000;
        int productionCosts = 9000;
        int profit = 13000;
        int netProfit = (profit - rentPrice - productionCosts) * 12;
        System.out.printf("Прибыль за год: %d руб.\n", netProfit);

        System.out.println("\n9. Определение существования треугольника");
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        boolean isTriangle = true;
        if(side1 + side2 <= side3) isTriangle = false;
        if(side1 + side3 <= side2) isTriangle = false;
        if(side2 + side3 <= side1) isTriangle = false;
        if(!isTriangle) {
            System.out.printf("Треугольник со сторонами %d, %d, %d не существует\n",
                side1, side2, side3);
        } else {
            int hypotenuse = side3;
            int cathet1 = side1;
            int cathet2 = side2;
            if(side1 > side2 && side1 > side3) {
                hypotenuse = side1;
                cathet1 = side3;
            } else if(side2 > side1 && side2 > side3) {
                hypotenuse = side2;
                cathet2 = side1;
            }
            double triangleArea = 0.5 * (cathet1 * cathet2);
            System.out.printf("Катеты треугольника равны %d и %d\n", cathet1, cathet2);
            System.out.printf("Площадь треугольника равна %.1f\n", triangleArea);
            System.out.println("|\\   ");
            System.out.println("  \\  ");
            System.out.println("|  \\ ");
            System.out.println("    \\");
            System.out.println("|____\\");
        }

        System.out.println("\n10. Подсчет количества банкнот");
        int totalSum = 567;
        int dozensInATM = 5;
        int hundredsCount = totalSum / 100;
        int dozensCount = totalSum % 100 / 10;
        int onesCount = totalSum % 1000 % 10;
        if(dozensInATM < dozensCount) {
            onesCount += (dozensCount - dozensInATM) * 10;
            dozensCount = dozensInATM;
        }
        int resultSum = (hundredsCount * 100) + (dozensCount * 10) + onesCount;
        System.out.printf("100$ - %d банкнот\n", hundredsCount);
        System.out.printf("10$ - %d банкнот\n", dozensCount);
        System.out.printf("1$ - %d банкнот\n", onesCount);
        System.out.printf("Результирующая сумма - %d$\n", resultSum);
    }
}
