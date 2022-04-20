public class Calculator {
    public static void main(String[] args) {
        // Input data
        int inputValue1 = 11;
        int inputValue2 = 3;
        char sign = '^';

        // Output data
        int result = 0;

        if (sign == '+') {
            result = inputValue1 + inputValue2;
        } else if (sign == '-') {
            result = inputValue1 - inputValue2;
        } else if (sign == '*') {
            result = inputValue1 * inputValue2;
        } else if (sign == '/') {
            result = inputValue1 / inputValue2;
        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < inputValue2; i++) {
                result = result * inputValue1;
            }
        } else if (sign == '%') {
            result = inputValue1 % inputValue2;
        }

        System.out.println(inputValue1 + " " + sign + " " + inputValue2 + " = " + result);
    }
}