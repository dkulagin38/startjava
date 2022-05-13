package com.startjava.lessons2_3_4.calculator;

import java.util.Arrays;
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

            int result = calc.calculate(mathElements);
/*
            I don't use the value below because the result is "[2, ^, 10]" instead of "2 ^ 10".
            String strMathElements = Arrays.toString(mathElements);
            System.out.println(strMathElements + " = " + result);
*/
            System.out.println(mathElements[0] + " " + mathElements[1] + " " + mathElements[2] + " = " + result);

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
