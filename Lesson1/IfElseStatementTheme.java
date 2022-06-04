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
            System.out.printf("Имя начинается на %с\n\n", nameFirstLetter);
        } else if(nameFirstLetter == 'I') {
            System.out.printf("Имя начинается на %c\n\n", nameFirstLetter);
        } else {
            System.out.println("Имя начинается на букву которую мы не ожидали\n");
        }

        System.out.println("2. Поиск max и min числа");
        int num1 = 34;
        int num2 = 3;
        if(num1 > num2) {
            System.out.printf("Максимальное число - %d\nМинимальное число - %d\n\n", num1, num2);
        } else if(num1 < num2) {
            System.out.printf("Максимальное число - %d\nМинимальное число - %d\n\n", num2, num1);
        } else {
            System.out.printf("%1$.2f равно %1$.2f\n\n", num1);
        }

        System.out.println("3. Работа с числом");
        int srcNum = 1612;
        if(srcNum != 0) {
            System.out.printf("Число %d не является нулем\n", srcNum);
            if(srcNum > 0) {
                System.out.printf("Число %d положительное\n", srcNum);
            } else {
                System.out.printf("Число %d отрицательное\n", srcNum);
            }

            if(srcNum % 2 == 0) {
                System.out.printf("Число %d четное\n\n", srcNum);
            } else {
                System.out.printf("Число %d нечетное\n\n", srcNum);
            }
        } else {
            System.out.printf("Число %d это ноль\n\n", srcNum);
        }

        System.out.println("4. Поиск одинаковых цифр в числах");
        num1 = 204;
        num2 = 224;
        boolean isHundredsEquals = num1 / 100 == num2 / 100;
        boolean isDozensEquals = (num1 % 100 / 10) == (num2 % 100 / 10);
        boolean isOnesEquals = (num1 % 100 % 10) == (num2 % 100 % 10);
        if(isHundredsEquals && isDozensEquals && isOnesEquals) {
            System.out.printf("В числах %d, %d одинаковые цифры %d, %d, %d стоят в разрядах сотен, десятков и единиц соответственно\n\n",
                num1, num2, num1 / 100, num1 % 100 / 10, num1 % 100 % 10);
        } else if(isHundredsEquals && isDozensEquals) {
            System.out.printf("В числах %d, %d одинаковые цифры %d, %d, стоят в разрядах сотен и десятков соответственно\n\n",
                num1, num2, num1 / 100, num1 % 100 / 10);
        } else if(isHundredsEquals && isOnesEquals) {
            System.out.printf("В числах %d, %d одинаковые цифры %d, %d, стоят в разрядах сотен и единиц соответственно\n\n",
                num1, num2, num1 / 100, num1 % 100 % 10);
        } else if(isDozensEquals && isOnesEquals) {
            System.out.printf("В числах %d, %d одинаковые цифры %d, %d, стоят в разрядах десятков и единиц соответственно\n\n",
                num1, num2, num1 % 100 / 10, num1 % 100 % 10);
        } else if(isHundredsEquals){
            System.out.printf("В числах %d, %d одинаковые цифры %d стоят в разрядах сотен\n\n",
                num1, num2, num1 / 100);
        } else if(isDozensEquals) {
            System.out.printf("В числах %d, %d одинаковые цифры %d стоят в разрядах десятков\n\n",
                num1, num2, num1 % 100 / 10);
        } else if(isOnesEquals) {
            System.out.printf("В числах %d, %d одинаковые цифры %d стоят в разрядах единиц\n\n",
                num1, num2, num1 % 100 % 10);
        } else {
            System.out.printf("В числах %d, %d нет одинаковых цифр в одиних и тех же разрядах\n\n", num1, num2);
        }

        System.out.println("5. Определение буквы, числа или символа по их коду");
        char character = '\u0057';
        if(character >= 'A' && character <= 'Z') {
            System.out.printf("%c большая буква\n\n", character);
        } else if(character >= 'a' && character <= 'z') {
            System.out.printf("%c маленькая буква\n\n", character);
        } else if(character >= '0' && character <= '9') {
            System.out.printf("%c - цифра\n\n", character);
        } else {
            System.out.printf("%c не буква и не цифра\n\n", character);
        }

        System.out.println("6. Определение суммы вклада и начисленных банком %");
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
        System.out.printf("Итоговая сумма - %.2f руб.\n\n", depositWithInterest);

        System.out.println("7. Определение оценки по предметам");
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
        System.out.printf("Cредний балл оценок по предметам - %d баллов\n", (historyScore + programScore) / 2);
        System.out.printf("Cредний %% по предметам - %.1f%%\n\n", (historyRate + programRate) / 2.0);

        System.out.println("8. Расчет прибыли");
        int rentPrice = 5000;
        int productionCosts = 9000;
        int profit = 13000;
        int netProfit = (profit * 12) - (rentPrice * 12) - 9000;
        System.out.printf("Прибыл за год: %d руб.\n\n", netProfit);

        System.out.println("9. Определение существования треугольника");
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        boolean isTriangle = true;
        if(side1 + side2 <= side3) isTriangle = false;
        if(side1 + side3 <= side2) isTriangle = false;
        if(side2 + side3 <= side1) isTriangle = false;
        if(!isTriangle) {
            System.out.printf("Треугольник со сторонами %d, %d, %d не существует\n\n",
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
            System.out.println("|____\\\n");
        }

        System.out.println("10. Подсчет количества банкнот");
        int neededSum = 567;
        int dozensInATM = 5;
        int hundredsCount = neededSum / 100;
        int dozensCount = neededSum % 100 / 10;
        int onesCount = neededSum % 1000 % 10;
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
