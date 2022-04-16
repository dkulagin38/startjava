// import java.util.Scanner;

public class CyclesTheme {
    public static void main(String[] args) {
        countEvenOddNums();
        printNumsBetweenMaxMin();
        printReverseNum();
        printNumsInSomeLines();
        checkEvenOfCountDigitsOne();
        printGeometricFigures();
        printASCIIChars();
        checkPalindrome();
        defineHappyNum();
        printPithagorasMultiplicationTable();
    }

    public static void countEvenOddNums() {
        // Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");

        int i = -10;
        int countEvenNums = 0;
        int countOddNums = 0;

        do {
            if (i % 2 == 0) {
                countEvenNums = countEvenNums + i;
            } else {
                countOddNums = countOddNums + i;
            }
        i++;
        } while (i < 22);

        System.out.println("Сумма чисел между -1 и 21: четных " + countEvenNums + 
                ", нечетных: " + countOddNums + ".");
    }

    public static void printNumsBetweenMaxMin() {
        // Вывод чисел между max и min
        System.out.println("\n2. Вывод чисел между max и min");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int maxNum = num1 > num2 ? num1 : num2;
        maxNum = num3 > num2 ? num3 : maxNum;

        int minNum = num1 < num2 ? num1 : num2;
        minNum = num3 < num2 ? num3 : minNum;

        System.out.println("Исходные числа: " + num1 + ", " + num2 + ", "+ num3 + 
                ". \nМаксимальное число: " + maxNum + ", минимальное: "+ minNum);

        System.out.print("Диапазон чисел:");

        for (int i = maxNum; i >= minNum; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void printReverseNum() {
        // Вывод реверсивного числа и суммы его цифр
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");

        int srcNum = 1234;

        String numByStr = Integer.toString(srcNum);
        String reverseNumByStr = "";
        String checkStr = "";
        int i = 0;
        int sum = 0;

        while (true) {
            char charOfNum = numByStr.charAt(i);
            reverseNumByStr = charOfNum + reverseNumByStr;
            checkStr = checkStr + charOfNum;
            sum = sum + Character.getNumericValue(charOfNum);

            if (numByStr.equals(checkStr)) {
                break;
            }
            
            i++;
        }

        System.out.println("Исходное число: " + srcNum + 
                ", реверсивное число " + Integer.parseInt(reverseNumByStr) + 
                ", сумма цифр " + sum + ".");
    }

    public static void printNumsInSomeLines() {
        // Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");

        int maxNumsInLine = 5;
        int countNumsInLine = 0;

        for (int i = 1; i < 25; i += 2) {
            countNumsInLine = countNumsInLine + 1;
            System.out.format("%02d ", i);

            if (countNumsInLine == maxNumsInLine) {
                System.out.println();
                countNumsInLine = 0;
            }
        }

        if (countNumsInLine != 0) {
            for (int j = countNumsInLine; j < maxNumsInLine; j++) {
                System.out.print("00 ");
            }
        }
    }

    public static void checkEvenOfCountDigitsOne() {
        // Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность");

        int srcNum = 3141591;

        String numByStr = Integer.toString(srcNum);
        String checkStr = "";
        int i = 0;
        int countDigitsOne = 0;

        while (true) {
            char charOfNum = numByStr.charAt(i);
            
            if (charOfNum == '1') {
                countDigitsOne = countDigitsOne + 1;
            }

            checkStr = checkStr + charOfNum;

            if (numByStr.equals(checkStr)) {
                break;
            }

            i++;
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
                countChars = countChars - 1;
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

    public static void printASCIIChars() {
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

    public static void printCharsRange(int startCode, int finishCode) {
        for (int i = startCode; i <= finishCode; i++) {
            if (i % 2 != 0) {
                char letter = (char) i;
                System.out.println(i + "  " + letter);
            }
        }
    }

    public static void checkPalindrome() {
        // Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом");

        int srcNum = 1234321;

        String numByStr = Integer.toString(srcNum);
        String checkStr = "";
        String reverseStr = "";
        int i = 0;

        while (true) {
            char charOfNum = numByStr.charAt(i);
            reverseStr = "" + charOfNum + reverseStr;
            checkStr = checkStr + charOfNum;

            if (numByStr.equals(checkStr)) {
                break;
            }

            i++;
        }

        if (numByStr.equals(reverseStr)) {
            System.out.println("Число '" + srcNum + "' является палиндромом.");
        } else {
            System.out.println("Число: '" + srcNum + "' не является палиндромом.");
        }
    }

    public static void defineHappyNum() {
        // Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым");

        int srcNum = 657963;

        String numByStr = Integer.toString(srcNum);
        int sumNums1 = 0;
        int sumNums2 = 0;

        for (int i = 0; i < 6; i++) {
            char charOfNum = numByStr.charAt(i);

            if (i < 3) {
                sumNums1 = sumNums1 + Character.getNumericValue(charOfNum);
            } else {
                sumNums2 = sumNums2 + Character.getNumericValue(charOfNum);
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