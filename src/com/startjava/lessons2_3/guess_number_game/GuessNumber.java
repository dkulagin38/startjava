package com.startjava.lessons2_3.guess_number_game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int targetNumber;

    // Accessors & mutators
    public int getTargetNumber() {
        return targetNumber;
    }

    public void setTargetNumber(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        Random rnd = new Random();
        setTargetNumber(rnd.nextInt(100) + 1);
        System.out.println("\n*** This is a secret message, nobody knows that one! ***");
        System.out.println("The computer have invented the number: " + targetNumber + ".");

        int playerNum;

        // The loop for guessing of the computer number.
        while (true) {
            playerNum = enterNumber(player1.getName());
            player1.setNum(playerNum);
            if (compareNumbers(player1)) {break;}

            playerNum = enterNumber(player2.getName());
            player2.setNum(playerNum);
            if (compareNumbers(player2)) {break;}
        }
    }

    private int enterNumber(String playerName) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n" + playerName + ", введите число: ");
        return scan.nextInt();
    }

    private boolean compareNumbers(Player player) {
        if (player.getNum() == targetNumber) {
            System.out.println("\nИгрок " + player.getName() + " угадал число.");
            return true;
    }

        String wordGreaterLess = (player.getNum() < targetNumber) ? "меньше" : "больше";
        System.out.println("Число " + player.getNum() + " " + wordGreaterLess + 
                " того, что загадал компьютер.");
        return false;
    }
}