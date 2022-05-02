package com.startjava.lessons2_3.guess_number_game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Player player1;
        Player player2;
        GuessNumber GuessNumber;

        while (true) {
            // Enter players.
            System.out.print("\nВведите имя 1-го игрока: ");
            String name = scan.nextLine();
            player1 = new Player(name);

            System.out.print("\nВведите имя 2-го игрока: ");
            name = scan.nextLine();
            player2 = new Player(name);

            GuessNumber = new GuessNumber(player1, player2);
            GuessNumber.playGame();

            if (!isNext()) {
                break;
            }
        }
    }

    private static boolean isNext() {
        String continueMessage = "Хотите продолжить игру? [yes/no]: ";
        System.out.print(continueMessage);

        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            answer = scan.nextLine();
            if (!(answer.equals("yes") || answer.equals("y") 
                || answer.equals("no") || answer.equals("n"))) {
                System.out.println("Некорректный ответ. Попробуйте еще раз.\n");
                System.out.print(continueMessage);
            }
        } while (!(answer.equals("yes") || answer.equals("y") 
            || answer.equals("no") || answer.equals("n")));

        if (answer.equals("yes") || answer.equals("y")) {
            return true;
        } else {
            return false;
        }
    }
}