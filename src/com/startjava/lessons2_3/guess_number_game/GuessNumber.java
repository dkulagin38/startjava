package com.startjava.lessons2_3.guess_number_game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void gameLaunch() {
        Random rnd = new Random();
        int targetNumber = rnd.nextInt(101);
        System.out.println("\n*** This is a secret message, nobody knows that one! ***");
        System.out.println("The computer have invented the number: " + targetNumber + ".");

        int playerNum;

        // The loop for guessing of the computer number.
        while (true) {
            playerNum = enterNumber(player1.getName());
            player1.setNum(playerNum);

            if (compareNumbers(targetNumber, playerNum, player1.getName())) {
                break;
            }

            playerNum = enterNumber(player2.getName());
            player2.setNum(playerNum);

            if (compareNumbers(targetNumber, playerNum, player2.getName())) {
                break;
            }
        }
    }

    private int enterNumber(String playerName) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n" + playerName + ", введите число: ");
        return scan.nextInt();
    }

    private static boolean compareNumbers(int targetNumber, int playerNum, String playerName) {
        if (playerNum == targetNumber) {
            System.out.println(playerName + ", Вы угадали!");
            System.out.println("\nПобедил игрок: " + playerName);
            return true;
        }

        String wordGreaterLess = (playerNum < targetNumber) ? "меньше" : "больше";
        System.out.println("Число " + playerNum + " " + wordGreaterLess + 
                " того, что загадал компьютер.");
        return false;
    }
}