public class Calculator {
    public static void main(String[] args) {
        // Input data
        int num1 = 11;
        int num2 = 3;
        char sign = '^';

        // Output data
        int result = 0;

        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < num2; i++) {
                result = result * num1;
            }
        } else if (sign == '%') {
            result = num1 % num2;
        }

        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}