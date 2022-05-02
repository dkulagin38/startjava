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

    public void playGame() {
        Random rnd = new Random();
        int computerNum = rnd.nextInt(100);
        System.out.println("\n*** This is a secret message, nobody knows that one! ***");
        System.out.println("The computer have invented the number: " + computerNum + ".");

        String playerName;
        int playerNum;

        // The loop for guessing of the computer number.
        while (true) {
            playerName = player1.getName();
            playerNum = enterNumber(playerName);
            player1.setNum(playerNum);

            if (compareNumbers(computerNum, playerNum)) {
                break;
            }

            playerName = player2.getName();
            playerNum = enterNumber(playerName);
            player2.setNum(playerNum);

            if (compareNumbers(computerNum, playerNum)) {
                break;
            }
        }

        // The end of the game.
        System.out.println("\nПобедил игрок: " + playerName);
    }

    private int enterNumber(String playerName) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n" + playerName + ", введите число: ");
        return scan.nextInt();
    }

    private static boolean compareNumbers(int computerNum, int playerNum) {
        if (playerNum == computerNum) {
            System.out.println("Вы угадали!");
            return true;
        }

        String wordGreaterLess = (playerNum < computerNum) ? "меньше" : "больше";
        System.out.println("Число " + playerNum + " " + wordGreaterLess + 
                " того, что загадал компьютер.");
        return false;
    }
}