import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        inputDataAndCalculate();
    }

    private static void inputDataAndCalculate() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();

        System.out.print("Введите арифметический знак: ");
        char sign = scan.next().charAt(0);

        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();

        Calculator calc = new Calculator();
        calc.calculate(num1, num2, sign);

        // I use this code because the 'nextLine' have skipped at the first time.
        scan.nextLine();

        boolean isCorrectAnswer = false;
        while (!isCorrectAnswer) {
            System.out.print("Хотите продолжить вычисления? [yes/no]:");
            String answer = scan.nextLine();

            if (answer.equals("yes") || answer.equals("y")) {
                isCorrectAnswer = true;
                inputDataAndCalculate();
            } else if (answer.equals("no") || answer.equals("n")) {
                isCorrectAnswer = true;
            } else {
                System.out.println("Некорректный ответ. Попробуйте еще раз.");
            }
        }
    }
}