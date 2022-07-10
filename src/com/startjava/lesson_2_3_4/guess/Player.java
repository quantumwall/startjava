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
        this.attempt = attempt >= 0 || attempt < numbers.length ? attempt : 0;
    }
    
    public int getAttempt() {
        return attempt;
    }
    
    public void addNumber(int number) {
        numbers[attempt++] = number;
    }
    
    public int getNumber() {
        return numbers[attempt - 1];
    }
    
    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }
    
    public void resetNumbers() {
        Arrays.fill(numbers, 0, attempt, 0);
    }
    
}
