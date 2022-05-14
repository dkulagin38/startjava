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

    public void setCountAttempts(int countAttempts) {
        this.countAttempts = countAttempts;
    }

    public void setNumber(int number, int index) {
        numbers[index] = number;
    }

    public int getLastNumber() {
        return numbers[countAttempts - 1];
    }

    public void clearPreviousGameNumbers() {
        if (countAttempts > 0) {
            Arrays.fill(numbers, 0, countAttempts - 1, 0);
            countAttempts = 0;
        }
    }

    public int[] getUsedNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }
}