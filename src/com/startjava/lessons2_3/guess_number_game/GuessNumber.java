package com.startjava.lessons2_3.guess_number_game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public void playGame() {
        Random rnd = new Random();
        int computerNum = rnd.nextInt(100);
        System.out.println("\n*** This is a secret message, nobody knows that one! ***");
        System.out.println("The computer have invented the number: " + computerNum + ".");

        Scanner scan = new Scanner(System.in);
        
        // Enter player's names.
        player1 = new Player();
        System.out.print("\nВведите имя 1-го игрока: ");
        player1.setName(scan.nextLine());

        player2 = new Player();
        System.out.print("\nВведите имя 2-го игрока: ");
        player2.setName(scan.nextLine());
        
        // The loop variables.
        String playerName;
        int playerNum = 0;

        // The loop for guessing of the computer number.
        while (true) {
            playerName = player1.getName();
            player1.enterNumber(playerName);
            playerNum = player1.getNum();

            if (compareNumbers(computerNum, playerNum)) {
                break;
            }

            playerName = player2.getName();
            player2.enterNumber(playerName);
            playerNum = player2.getNum();

            if (compareNumbers(computerNum, playerNum)) {
                break;
            }
        }

        // The end of the game.
        System.out.println("\nПобедил игрок: " + playerName);
    }

    /* 
     I suppose that the name 'compareNumbers' is not correct in this case. 
     The name of the boolean type method have to be as an adjective 
     but not as a verb (see an article "The rules of the format code").
    */
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