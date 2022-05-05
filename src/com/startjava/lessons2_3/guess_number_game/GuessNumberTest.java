package com.startjava.lessons2_3.guess_number_game;

import java.util.Scanner;

public class GuessNumberTest {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1;
        Player player2;
        GuessNumber guessNumber;

        // Enter players.
        System.out.print("\nВведите имя 1-го игрока: ");
        String name = scan.nextLine();
        player1 = new Player(name);

        System.out.print("\nВведите имя 2-го игрока: ");
        name = scan.nextLine();
        player2 = new Player(name);

        do {
            guessNumber = new GuessNumber(player1, player2);
            guessNumber.gameLaunch();
        } while (isNext());
    }

    private static boolean isNext() {
        String continueMessage = "Хотите продолжить игру? [yes/no]: ";
        System.out.print(continueMessage);

        String answer;

        do {
            answer = scan.nextLine();
            if (!isCorrectAnswer(answer)) {
                System.out.println("Некорректный ответ. Попробуйте еще раз.\n");
                System.out.print(continueMessage);
            }
        } while (!isCorrectAnswer(answer));

        if (isAnswerYes(answer)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isCorrectAnswer(String answer) {
        return (isAnswerYes(answer) || isAnswerNo(answer));
    }
    
    private static boolean isAnswerYes(String answer) {
        return (answer.equals("yes") || answer.equals("y"));
    }

    private static boolean isAnswerNo(String answer) {
        return (answer.equals("no") || answer.equals("n"));
    }
}