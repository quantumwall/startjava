package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int len = numbers.length;
        printIntArray(numbers);
        for(int i = 0; i < len / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[len - i - 1];
            numbers[len - i - 1] = temp;
        }
        printIntArray(numbers);

        System.out.println("\n2. Вывод произведения элементов массива");
        len = 10;
        numbers = new int[len];
        int multiply = 1;
        for(int i = 0; i < len; i++) {
            int number = generateRandomNumber(0, 10);
            numbers[i] = number;
            multiply *= number > 0 && number < 9 ? number : 1;
        }
        printIntArray(numbers);
        System.out.printf("Multiply %d\n", multiply);
        

        System.out.println("\n3. Удаление элементов массива");
        len = 15;
        double[] dNumbers = new double[len];
        for(int i = 0; i < len; i++) {
            dNumbers[i] = Math.random();
        }
        printDoubleArray(dNumbers);
        double middleCellValue = dNumbers[len / 2];
        int resetsCount = 0;
        for(int i = 0; i < len; i++) {
            if(i != len / 2 && dNumbers[i] > middleCellValue) {
                dNumbers[i] = 0;
                resetsCount++;
            }
        }
        printDoubleArray(dNumbers);
        System.out.printf("Количество обнуленных ячеек - %d\n", resetsCount);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        len = 26;
        char[] charArr = new char[len];
        for(int i = 0, k = 'A'; i < len; i++, k++) {
            charArr[i] = (char) k;
        }
        for(int i = 0; i < len; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.printf("%c ", charArr[charArr.length - j - 1]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        len = 30;
        numbers = new int[len];
        for(int i = 0; i < len; i++) {
            int number = generateRandomNumber(30, 61);
            while(isNumberInArray(number, numbers)) {
                number = generateRandomNumber(30, 61);
            }
            numbers[i] = number;
        }
        sortArray(numbers);
        for(int i = 0, column = 1; i < len; i++, column++) {
            if(column == 10) {
                System.out.printf("%2d\n", numbers[i]);
                column = 0;
            } else {
                System.out.printf("%2d ", numbers[i]);
            }
        }

        System.out.println("\n6. Сдвиг элементов массива");
        String[] strings = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        len = 0;
        for(String string : strings) {
            if(!string.isBlank()) {
                len++;
            }
        }
        String[] newArray = new String[len];
        int srcFrom = 0;
        int destFrom = 0;
        int length = 1;
        for(int i = 0; i < strings.length;) {
            if(!strings[i].isBlank()) {
                srcFrom = i;
                if(i < strings.length - 1) {
                    for(int k = i + 1; k < strings.length; k++) {
                        if(!strings[k].isBlank()) {
                            length++;
                        } else {
                            break;
                        }
                    }
                }
                System.arraycopy(strings, srcFrom, newArray, destFrom, length);
                destFrom += length;
                i += length;
                length = 1;
            } else {
                i++;
            }
        }
        printStringArray(strings);
        printStringArray(newArray);
    }

    private static void printIntArray(int[] numbers) {
        for(int number : numbers) {
            System.out.printf("%d ", number);
        }
        System.out.println();
    }

    private static void printDoubleArray(double[] dNumbers) {
        for(double dNumber : dNumbers) {
            System.out.printf("%.3f ", dNumber);
        }
        System.out.println();
    }
    
    private static void printStringArray(String[] strings) {
        for(String string : strings) {
            System.out.printf("%s ", string);
        }
        System.out.println();
    }

    private static void sortArray(int[] array) {
        int len = array.length;
        for(int i = 0; i < len - 1; i++) {
            for(int k = 0; k < len - i - 1; k++) {
                if(array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
    }

    private static boolean isNumberInArray(int number, int[] array) {
        for(int num : array) {
            if(num == number) {
                return true;
            }
        }
        return false;
    }
    
    private static int generateRandomNumber(int from, int to) {
        return from + (int) (Math.random() * (to - from));
    }
}
