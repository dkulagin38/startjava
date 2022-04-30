package com.startjava.lessons2_3.guess_number_game;

import java.util.Random;

public class GuessNumber {
    
    public static void playGame(Player player1, Player player2) {
        Random rnd = new Random();
        int computerNum = rnd.nextInt(100);
        System.out.println("\n*** This is a secret message, nobody knows that one! ***");
        System.out.println("The computer have invented the number: " + computerNum + ".");

        String playerName;
        int playerNum;

        // The loop for guessing of the computer number.
        while (true) {
            playerName = player1.getName();
            playerNum = player1.enterNumber(playerName);
            if (NumbersEqual(computerNum, playerNum)) {
                break;
            }

            playerName = player2.getName();
            playerNum = player2.enterNumber(playerName);
            if (NumbersEqual(computerNum, playerNum)) {
                break;
            }
        }

        // The end of the game.
        System.out.println("\nПобедил игрок: " + playerName);
    }

    private static boolean NumbersEqual(int computerNum, int playerNum) {
        if (playerNum == computerNum) {
            System.out.println("Вы угадали!");
            return true;
        }

        String wordGreaterLess = "больше";
        if (playerNum < computerNum) {
            wordGreaterLess = "меньше";
        }
        
        System.out.println("Число " + playerNum + " " + wordGreaterLess + 
                " того, что загадал компьютер.");
        return false;
    }
}