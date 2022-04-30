package com.startjava.lessons2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            System.out.print("Введите первое число: ");
            int num1 = scan.nextInt();

            System.out.print("Введите арифметический знак: ");
            char sign = scan.next().charAt(0);

            System.out.print("Введите второе число: ");
            int num2 = scan.nextInt();

            calc.calculate(num1, num2, sign);

            // I use this code because the 'nextLine' has skipped at the first time.
            scan.nextLine();
            
            String continueMessage = "Хотите продолжить вычисления? [yes/no]:";
            System.out.print(continueMessage);
            String answer = scan.nextLine();

            while (!(answer.equals("yes") || answer.equals("y") 
                || answer.equals("no") || answer.equals("n"))) {
                System.out.print("Некорректный ответ. Попробуйте еще раз.\n" + continueMessage);
                answer = scan.nextLine();
            }

            if (answer.equals("no") || answer.equals("n")) {
                return;
            }
        }
    }
}