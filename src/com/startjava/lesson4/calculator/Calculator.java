package com.startjava.lesson4.calculator;

public class Calculator {

    public int calculate(int num1, int num2, char sign) {
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
                System.out.println("Введено некорректное значения арифметического знака.");
                return 0;
        }
    }
}
