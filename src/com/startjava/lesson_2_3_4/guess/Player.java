package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    
    private String name;
    private int[] numbers = new int[10];
    private int attempt = 0;
    
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
    
    public void setNumber(int number, int index) throws Exception {
        if(number <= 0 && number > 100) {
            throw new Exception("Число из недоспустимого диапазона значений");
        }
        numbers[index] = number;
    }
    
    public int getNumber(int index) {
        return numbers[index];
    }
    
    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }
    
    public void resetNumbers() {
        Arrays.fill(numbers, 0, attempt, 0);
    }
    
}
