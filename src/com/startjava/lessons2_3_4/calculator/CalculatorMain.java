package com.startjava.lessons2_3_4.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorMain {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            Calculator calc = new Calculator();
            System.out.print("Введите математическое выражение: ");
            String mathExpression = scan.nextLine();
            int result = calc.calculate(mathExpression);
            System.out.println(mathExpression + " = " + result);
        } while (isNext());
    }

    private static boolean isNext() {
        String continueMessage = "Хотите ввести новое выражение? [yes/no]: ";
        System.out.print(continueMessage);

        String answer;
        do {
            answer = scan.nextLine();
            if (isIncorrectAnswer(answer)) {
                System.out.println("Некорректный ответ. Попробуйте еще раз.\n");
                System.out.print(continueMessage);
            }
        } while (isIncorrectAnswer(answer));

        return isAnswerYes(answer);
    }

    private static boolean isIncorrectAnswer(String answer) {
        return !(isAnswerYes(answer) || answer.equals("no") || answer.equals("n"));
    }

    private static boolean isAnswerYes(String answer) {
        return (answer.equals("yes") || answer.equals("y"));
    }
}
