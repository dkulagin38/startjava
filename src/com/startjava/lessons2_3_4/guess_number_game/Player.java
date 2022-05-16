package com.startjava.lessons2_3_4.guess_number_game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    private int countAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void setCountAttempt(int countAttempt) {
        countAttempts = countAttempt;
    }

    public void setNumber(int number) {
        numbers[countAttempts - 1] = number;
    }

    public int getLastNumber() {
        return numbers[countAttempts - 1];
    }

    public void resetNumbers() {
        if (countAttempts > 0) {
            Arrays.fill(numbers, 0, countAttempts - 1, 0);
            countAttempts = 0;
        }
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }
}