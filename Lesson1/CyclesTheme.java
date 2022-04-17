// import java.util.Scanner;

public class CyclesTheme {
    public static void main(String[] args) {
        countEvenOddNums();
        printNumsBetweenMaxMin();
        printReverseNum();
        printNumsInSomeLines();
        checkEvenOfCountDigitsOne();
        printGeometricFigures();
        printAsciiChars();
        checkPalindrome();
        defineHappyNum();
        printPithagorasMultiplicationTable();
    }

    public static void countEvenOddNums() {
        // Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");

        int i = -10;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        } while (i < 22);

        System.out.println("Сумма чисел между -1 и 21: четных " + sumEven + 
                ", нечетных: " + sumOdd + ".");
    }

    public static void printNumsBetweenMaxMin() {
        // Вывод чисел между max и min
        System.out.println("\n2. Вывод чисел между max и min");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        // Previous code:
        // int maxNum = num1 > num2 ? num1 : num2;
        // maxNum = num3 > num2 ? num3 : maxNum;

        // int minNum = num1 < num2 ? num1 : num2;
        // minNum = num3 < num2 ? num3 : minNum;

        // I'm not quite sure that I understand the mentor correctly about code reduction.
        int maxNum = num1;
        if (maxNum < num2) maxNum = num2;
        if (maxNum < num3) maxNum = num3;
        
        int minNum = num2;
        if (minNum > num1) minNum = num1;
        if (minNum > num3) minNum = num3;

        System.out.println("Исходные числа: " + num1 + ", " + num2 + ", "+ num3 + 
                ". \nМаксимальное число: " + maxNum + ", минимальное: " + minNum);

        System.out.print("Диапазон чисел:");

        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void printReverseNum() {
        // Вывод реверсивного числа и суммы его цифр
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");

        int srcNum = 1234;

        int totalCountDigits = countDigitsInNumber(srcNum);
        int digit;
        int countDigits = 0;
        int sumDigits = 0;
        int reverseNum = 0;
        int pow;
        int num = srcNum;

        while (true) {
            digit = num % 10;
            num = num / 10;
            sumDigits += digit;
            ++countDigits;

            pow = 1;
            for (int j = 0; j < (totalCountDigits - countDigits + 1); j++) {
                pow = pow * 10;
            }
            pow = pow / 10;
            reverseNum = reverseNum + digit * pow;

            if (countDigits == totalCountDigits) break;
        }

        System.out.println("Исходное число: " + srcNum + 
                ", реверсивное число " + reverseNum + 
                ", сумма цифр " + sumDigits + ".");
    }

    private static int countDigitsInNumber(int num) {
        int countDigits = 0;

        while (true) {
            num = num / 10;
            ++countDigits;
            if (num == 0) return countDigits;
        }
    }

    public static void printNumsInSomeLines() {
        // Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");

        int maxNumsInLine = 5;
        int countNumsInLine = 0;

        for (int i = 1; i < 25; i += 2) {
            countNumsInLine += 1;
            // Commented previous code:
            // System.out.format("%02d ", i);
            System.out.printf("%3d", i);

            if (countNumsInLine == maxNumsInLine) {
                System.out.println();
                countNumsInLine = 0;
            }
        }

        if (countNumsInLine != 0) {
            for (int j = countNumsInLine; j < maxNumsInLine; j++) {
                // Commented previous code:
                // System.out.print(" 00");
                System.out.printf("%3d", 0);
            }
        }
    }

    public static void checkEvenOfCountDigitsOne() {
        // Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность");

        int srcNum = 3141591;

        int num = srcNum;
        int countDigitsOne = 0;
        int digit;

        while (true) {
            digit = num % 10;
            num = num / 10;

            if (digit == 1) ++countDigitsOne;
            if (num == 0) break;
        }

        System.out.print("Исходное число: " + srcNum + ". Количество единиц: " + 
                countDigitsOne + " - ");

        if (countDigitsOne % 2 == 0) {
            System.out.println("четное количество.");
        } else {
            System.out.println("нечетное количество.");
        }
    }

    public static void printGeometricFigures() {
        // Отображение фигур в консоли
        System.out.println("\n6. Отображение фигур в консоли");

        // Print the square
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Print the right triangle
        int i = 0;
        while (i < 5) {
            int countChars = 5 - i;
            while (countChars > 0) {
                System.out.print("#");
                countChars -= 1;
            }
            System.out.println();
            i++;
        }
        System.out.println();

        // Print the second triangle
        i = 0;
        do {
            if (i == 0 || i == 4) {
                System.out.println("$");
            } else if (i == 1 || i == 3) {
                System.out.println("$$");
            } else if (i == 2) {
                System.out.println("$$$");
            }
            i++;
        } while (i < 5);
    }

    public static void printAsciiChars() {
        // Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов");

        System.out.println("Dec Char");
        printCharsRange(65, 90);
        printCharsRange(97, 122);
        /*
         * I've commented the code below because character is printed as '?' for some reason.
         * I don't know what I have to do to print a normal Russian charater.
        */
        // Scanner console = new Scanner(System.in, "cp866");
        // printCharsRange(128, 175);
        // printCharsRange(224, 241);
    }

    private static void printCharsRange(int startCode, int finishCode) {
        for (int i = startCode; i <= finishCode; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d" + " " + (char) i + "\n", i);
            }
        }
    }

    public static void checkPalindrome() {
        // Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом");

        int srcNum = 1234321;

        int totalCountDigits = countDigitsInNumber(srcNum);
        int digit;
        int countDigits = 0;
        int sumDigits = 0;
        int reverseNum = 0;
        int pow;
        int num = srcNum;

        while (true) {
            digit = num % 10;
            num = num / 10;
            sumDigits += digit;
            ++countDigits;

            pow = 1;
            for (int j = 0; j < (totalCountDigits - countDigits + 1); j++) {
                pow = pow * 10;
            }
            pow = pow / 10;
            reverseNum = reverseNum + digit * pow;

            if (countDigits == totalCountDigits) break;
        }

        if (reverseNum == srcNum) {
            System.out.println("Число '" + srcNum + "' является палиндромом.");
        } else {
            System.out.println("Число: '" + srcNum + "' не является палиндромом.");
        }
    }

    public static void defineHappyNum() {
        // Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым");

        int srcNum = 657963;

        int num = srcNum;
        int sumNums1 = 0;
        int sumNums2 = 0;
        int digit;

        for (int i = 0; i < 6; i++) {
            digit = num % 10;
            num = num / 10;

            if (i < 3) {
                sumNums1 += digit;
            } else {
                sumNums2 += digit;
            }
        }

        if (sumNums1 == sumNums2) {
            System.out.println("Число " + srcNum + " счастливое.");
        } else {
            System.out.println("Число " + srcNum + " не счастливое.");
        }
    }

    public static void printPithagorasMultiplicationTable() {
        // Вывод таблицы умножения Пифагора
        System.out.println("\n10. Вывод таблицы умножения Пифагора");

        System.out.print("  | ");
        for (int i = 2; i < 10; i++) {
            System.out.format("% 2d ", i);
        }
        System.out.println("\n---------------------------");

        for (int i = 2; i < 10; i++) {
            System.out.print(i + " | ");
            for (int j = 2; j < 10; j++) {
                // I've commented the code below because it doesn't work as I expected 
                // (only ' ' without '0'):
                // System.out.format("% 2d ", i * j);
                System.out.format("%02d ", i * j);
            }
            System.out.println();
        }
    }
}