package com.startjava.lessons2_3.guess_number_game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            // Enter players' names
            Player player1 = new Player();
            System.out.print("\nВведите имя 1-го игрока: ");
            player1.setName(scan.nextLine());

            Player player2 = new Player();
            System.out.print("Введите имя 2-го игрока: ");
            player2.setName(scan.nextLine());

            GuessNumber GuessNumber = new GuessNumber();
            GuessNumber.playGame(player1, player2);

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
            if (answer.equals("yes") || answer.equals("y")) {
                return true;
            } else if (answer.equals("no") || answer.equals("n")) {
                return false;
            } else {
                System.out.println("Некорректный ответ. Попробуйте еще раз.\n");
                System.out.print(continueMessage);
            }
        } while (true);
    }
}