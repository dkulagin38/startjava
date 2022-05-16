package com.startjava.lessons2_3_4.calculator;

public class Calculator {

    public int calculate(String mathExpression) {
        String[] mathElements = mathExpression.split(" ");
        int num1 = Integer.parseInt(mathElements[0]);
        int num2 = Integer.parseInt(mathElements[2]);
        char sign = mathElements[1].charAt(0);

        switch (sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '%':
                return num1 % num2;
            case '^':
                return (int) Math.pow(num1, num2);
            default:
                System.out.println("Введено некорректное значение арифметического знака.");
                return 0;
        }
    }
}
