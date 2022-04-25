public class Calculator {

    public void calculate(int num1, int num2, char sign) {
        int result = 0;
        
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < num2; i++) {
                    result = result * num1;
                }
                break;
            default:
                System.out.println("Введено некорректное значения арифметического знака.");
                return;
        }

        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}