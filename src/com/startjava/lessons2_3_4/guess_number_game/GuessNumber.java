package com.startjava.lessons2_3_4.guess_number_game;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        player1.clearPreviousGameNumbers();
        player2.clearPreviousGameNumbers();

        Random rnd = new Random();
        targetNumber = rnd.nextInt(100) + 1;

//        This is a debug message. It's have to comment or delete after debugging.
        System.out.println("\n*** This is a secret message, nobody knows that one! ***");
        System.out.println("The computer have invented the number: " + targetNumber + ".");

        // The loop for guessing of the target number.
        for (int i = 0; i < 10; i++) {
            if (successGuessAttempt(player1, i)) break;
            if (successGuessAttempt(player2, i)) break;
        }
        printAllPlayerNumbers(player1);
        printAllPlayerNumbers(player2);
    }

    private boolean successGuessAttempt(Player player, int attemptIndex) {
        int playerNum = enterNumber(player);
        player.setCountAttempts(attemptIndex + 1);
        player.setNumber(playerNum, attemptIndex);
        if (compareNumbers(player)) return true;
        if (attemptIndex == 9) {
            System.out.println("У " + player.getName() + " закончились попытки.");
        }
        return false;
    }

    private int enterNumber(Player currentPlayer) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n" + currentPlayer.getName() + ", введите число: ");
        return scan.nextInt();
    }

    private boolean compareNumbers(Player player) {
        if (player.getLastNumber() == targetNumber) {
            System.out.println("\nИгрок " + player.getName() + " угадал число " + targetNumber +
                    " с " + player1.getCountAttempts() + "-й попытки.");
            return true;
        }

        String wordGreaterLess = (player.getLastNumber() < targetNumber) ? "меньше" : "больше";
        System.out.println("Число " + player.getLastNumber() + " " + wordGreaterLess +
                " того, что загадал компьютер.");
        return false;
    }

    private void printAllPlayerNumbers(Player player) {
        System.out.print("\nИгрок " + player.getName() + " называл числа:");
        int[] usedNumbers = player.getUsedNumbers();
        for (int number : usedNumbers) {
            System.out.print(" " + number);
        }
    }
}