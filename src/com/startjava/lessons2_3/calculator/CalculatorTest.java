package com.startjava.lessons2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            Calculator calc = new Calculator();

            System.out.print("Введите первое число: ");
            int num1 = scan.nextInt();

            System.out.print("Введите арифметический знак: ");
            char sign = scan.next().charAt(0);

            System.out.print("Введите второе число: ");
            int num2 = scan.nextInt();

            calc.calculate(num1, num2, sign);

            // I use this code because the 'nextLine' has skipped at the first time.
            scan.nextLine();
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