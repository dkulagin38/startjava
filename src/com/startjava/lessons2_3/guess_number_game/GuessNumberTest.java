package com.startjava.lessons2_3.guess_number_game;

import java.util.Scanner;

public class GuessNumberTest {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Enter players.
        System.out.println("Введите имя 1-го игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Введите имя 2-го игрока: ");
        Player player2 = new Player(scan.nextLine());

        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.launch();
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

        return isAnswerYes(answer);
    }

    private static boolean isCorrectAnswer(String answer) {
        return (isAnswerYes(answer) || answer.equals("no") || answer.equals("n"));
    }
    
    private static boolean isAnswerYes(String answer) {
        return (answer.equals("yes") || answer.equals("y"));
    }
}