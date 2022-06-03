public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        char firstLetterCpuName = 'A';
        double cpuFrequency = 3.9;
        float gpuFrequency = 0.3F;
        byte ramSize = 16;
        short ramFrequency = 2600;
        int coreCpuCount = 8;
        long powerSuplier = 600L;
        boolean isLaptop = false;
        System.out.println("Первая буква названия процессора - " + firstLetterCpuName);
        System.out.println("Количество ядер процессора - " + coreCpuCount);
        System.out.println("Рабочая частота процессора - " + cpuFrequency + " GHz");
        System.out.println("Рабочая частота графической карты - " + gpuFrequency + " GHz");
        System.out.println("Размер оперативной памяти - " + ramSize + " Gb");
        System.out.println("Рабочая частоты оперативной памяти - " + ramFrequency + " MHz");
        System.out.println("Мощность блока питания - " + powerSuplier + " W");
        System.out.println("Ноутбук - " + isLaptop + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        int product1 = 100;
        int product2 = 200;
        int discount = 11;
        double discountPrice = (product1 + product2) * (discount / 100.0);
        double priceWithDiscount = product1 + product2 - discountPrice;
        System.out.println("Сумма скидки - " + discountPrice + " руб");
        System.out.println("Общая стоимость товаров со скидкой - " + priceWithDiscount + " руб\n");

        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a\n");

        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("byte до инкремента - " + maxByte);
        System.out.println("byte после инкремента - " + (++maxByte));
        System.out.println("byte после декремента - " + (--maxByte));
        System.out.println("short до инкремента - " + maxShort);
        System.out.println("short после инкремента - " + (++maxShort));
        System.out.println("short после декремента - " + (--maxShort));
        System.out.println("integer до инкремента - " + maxInt);
        System.out.println("integer после инкремента - " + (++maxInt));
        System.out.println("integer после декремента - " + (--maxInt));
        System.out.println("long до инкремента - " + maxLong);
        System.out.println("long после инкремента - " + (++maxLong));
        System.out.println("long после декремента - " + (--maxLong) + "\n");

        System.out.println("5. Перестановка значений переменных");
        double num1 = 1.1;
        double num2 = 2.2;
        System.out.println("Перестановка значений через третью переменную");
        System.out.println("До перестановки");
        System.out.println("num1 = " + num1 + "; num2 = " + num2);
        double temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("После перестановки");
        System.out.println("num1 = " + num1 + "; num2 = " + num2);
        System.out.println("Перестановка значений посредством арифметической операции");
        System.out.println("До перестановки");
        System.out.println("num1 = " + num1 + "; num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("После перестановки");
        System.out.println("num1 = " + num1 + "; num2 = " + num2);
        System.out.println("Перестановка значений с помощью побитовой операции ^");
        System.out.println("До перестановки");
        System.out.println("num1 = " + num1 + "; num2 = " + num2);
        num1 = (int) num1 ^ (int) num2;
        num2 = (int) num1 ^ (int) num2;
        num1 = (int) num1 ^ (int) num2;
        System.out.println("После перестановки");
        System.out.println("num1 = " + num1 + "; num2 = " + num2 + "\n");


        System.out.println("6. Вывод символов и их кодов");
        int codePoint1 = 35;
        int codePoint2 = 38;
        int codePoint3 = 64;
        int codePoint4 = 94;
        int codePoint5 = 95;
        System.out.println(codePoint1 + " " + (char) codePoint1);
        System.out.println(codePoint2 + " " + (char) codePoint2);
        System.out.println(codePoint3 + " " + (char) codePoint3);
        System.out.println(codePoint4 + " " + (char) codePoint4);
        System.out.println(codePoint5 + " " + (char) codePoint5 + "\n");

        System.out.println("7. Произведение и сумма цифр числа");
        int srcNum = 345;
        int hundreds = srcNum / 100;
        int dozens = (srcNum % 100) / 10;
        int ones = srcNum % 10;
        System.out.println("Сумма цифр числа " + srcNum + " = " + (hundreds + dozens + ones));
        System.out.println("Произведение цифр числа " + srcNum + " = " + (hundreds * dozens * ones) + "\n");

        System.out.println("8. Вывод на консоль ASCII-арт Дюка");
        char whitespace = ' ';
        char slash = '/';
        char backslash = '\\';
        char underline = '_';
        char oBracket = '(';
        char cBracket = ')';
        System.out.println("" + whitespace + whitespace + whitespace + whitespace +
                slash + backslash + whitespace + whitespace + whitespace + whitespace);
        System.out.println("" + whitespace + whitespace + whitespace + slash + whitespace +
                whitespace + backslash + whitespace + whitespace + whitespace);
        System.out.println("" + whitespace + whitespace + slash + underline +
                oBracket + whitespace + cBracket + backslash + whitespace + whitespace);
        System.out.println("" + whitespace + slash + whitespace + whitespace + whitespace +
                whitespace + whitespace + whitespace + backslash + whitespace);
        System.out.println("" + slash + underline + underline + underline + underline +
                slash + backslash + underline + underline + backslash + "\n");
        
        System.out.println("9. Отображение количества сотен, десятков и единиц числа");
        srcNum = 123;
        hundreds = srcNum / 100;
        dozens = (srcNum % 100) / 10;
        ones = srcNum % 10;
        System.out.println("Число " + srcNum + " содержит:");
        System.out.println(hundreds + " сотен");
        System.out.println(dozens + " десятков");
        System.out.println(ones + " единиц\n");

        System.out.println("10. Преобразование секунд");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = totalSeconds % 60;
        int seconds = totalSeconds % 3600 % 60; 
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}
