package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        int len = intArr.length;
        printIntArray(intArr);
        for(int i = 0; i < len / 2; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[len - i - 1];
            intArr[len - i - 1] = temp;
        }
        printIntArray(intArr);

        System.out.println("\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        len = intArr.length;
        int multiply = 1;
        for(int i = 0; i < len; i++) {
            intArr[i] = i;
            multiply *= i > 0 && i < 9 ? i : 1;
            System.out.print((i > 0 && i < 8) ? i + " * " : (i == 8) ? i + " = " : "");
        }
        System.out.println(multiply);
        System.out.printf("Число %d - индекс %d\n", intArr[0], 0);
        System.out.printf("Число %d - индекс %d\n", intArr[9], 9);
        
        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for(int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        printDoubleArray(doubleArr);
        double middleCellValue = doubleArr[len / 2];
        int resetsCount = 0;
        for(int i = 0; i < len; i++) {
            if(doubleArr[i] > middleCellValue) {
                doubleArr[i] = 0;
                resetsCount++;
            }
        }
        printDoubleArray(doubleArr);
        System.out.printf("Количество обнуленных ячеек - %d\n", resetsCount);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        len = charArr.length;
        for(int i = 0, k = 'A'; i < len; i++, k++) {
            charArr[i] = (char) k;
        }
        for(int i = 0; i < len; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.printf("%c ", charArr[len - j - 1]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        len = intArr.length;
        int number = 60;
        for(int i = 0; i < len; i++) {
            while(isNumberInArray(number, intArr)) {
                number = generateRandomNumber(60, 101);
            }
            intArr[i] = number;
        }
        sortArray(intArr);
        for(int i = 0, column = 1; i < len; i++, column++) {
            System.out.print(column % 10 == 0 ? intArr[i] + "\n" : intArr[i] + " ");
        }

        System.out.println("\n6. Сдвиг элементов массива");
        String[] srcStrArr = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        len = 0;
        for(String string : srcStrArr) {
            if(!string.isBlank()) {
                len++;
            }
        }
        String[] newStrArr = new String[len];
        int srcFrom = 0;
        int destFrom = 0;
        int length = 1;
        for(int i = 0; i < srcStrArr.length;) {
            if(!srcStrArr[i].isBlank()) {
                srcFrom = i;
                if(i < srcStrArr.length - 1) {
                    for(int j = i + 1; j < srcStrArr.length; j++) {
                        if(!srcStrArr[j].isBlank()) {
                            length++;
                        } else {
                            break;
                        }
                    }
                }
                System.arraycopy(srcStrArr, srcFrom, newStrArr, destFrom, length);
                destFrom += length;
                i += length;
                length = 1;
            } else {
                i++;
            }
        }
        printStringArray(srcStrArr);
        printStringArray(newStrArr);
    }

    private static void printIntArray(int[] numbers) {
        for(int number : numbers) {
            System.out.printf("%d ", number);
        }
        System.out.println();
    }

    private static void printDoubleArray(double[] nums) {
        for(double num : nums) {
            System.out.printf("%.3f ", num);
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
            for(int j = 0; j < len - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
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
