package com.startjava.lesson4.calculator;

import java.util.Scanner;

public class CalculatorMain {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean askNext;

        do {
            Calculator calc = new Calculator();
            System.out.print("Введите математическое выражение: ");
            String mathExpression = scan.nextLine();
            String[] mathElements = mathExpression.split(" ");

            askNext = true;
            if (mathElements.length != 3) {
                System.out.println("Некорректное выражение. Количество элементов в выражении должно быть равно 3, " +
                        "элементы разделены пробелами.");
                askNext = false;
                continue;
            }

            int num1 = Integer.parseInt(mathElements[0]);
            int num2 = Integer.parseInt(mathElements[2]);
            char sign = mathElements[1].charAt(0);

            int result = calc.calculate(num1, num2, sign);
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        } while (isNext(askNext));
    }

    private static boolean isNext(boolean askNext) {
        if (!askNext) return true;

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
