package com.startjava.lessons2_3.guess_number_game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            GuessNumber GuessNumber = new GuessNumber();
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