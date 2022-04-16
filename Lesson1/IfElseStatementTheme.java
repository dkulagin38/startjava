public class IfElseStatementTheme {
    public static void main(String[] args) {
        transferPseudocodeToJava();
        determineMaxMinNum();
        determineNum();
        searchEqualDigitsInNum();
        determineCharTypeByCode();
        determineBankAccrual();
        determineGradesSubjects();
        calculateProfitLoss();
        determineOfExistingTriangle();
        amountBanknotes();
    }

    public static void transferPseudocodeToJava() {
        // Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java\n");

        int age = 35;
        if (age > 20) {
            System.out.println("Возраст " + age + " лет - слишком старый!");
        } else {
            System.out.println("Возраст " + age + " лет - слишком молодой!");
        }

        String sex = "female";
        boolean isMale = sex == "male";
        if (!isMale) {
            System.out.println("Женщина - друг человека! (с) А. Райкин");
        }

        float height = 1.5f;
        if (height < 1.8) {
            System.out.println("Рост " + height + " - коротышка!");
        } else {
            System.out.println("Рост " + height + " - дылда!");
        }

        String name = "Mahboobeh";
        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("" + name + " is the best name of the World!");
        } else if (firstLetterOfName == 'I') {
            System.out.println("" + name + " - just a good name.");
        } else {
            System.out.println("Your name is " + name);
        }
    }

    public static void determineMaxMinNum() {
        // Поиск максимального и минимального числа
        System.out.println("\n2. Поиск максимального и минимального числа\n");

        int srcNum1 = 123;
        int srcNum2 = 789;

        System.out.println("Исходные числа: " + srcNum1 + " и " + srcNum2 + ".");
        if (srcNum1 > srcNum2) {
            System.out.println("Максимальное: " + srcNum1 + ", минимальное: " + srcNum2 + ".");
        } else if (srcNum1 < srcNum2) {
            System.out.println("Максимальное: " + srcNum2 + ", минимальное: " + srcNum1 + ".");
        } else {
            System.out.println("Числа равны.");
        }
    }

    public static void determineNum() {
        // Работа с числом
        System.out.println("\n3. Работа с числом\n");

        int srcNum = 789;

        System.out.println("Исходное число: " + srcNum);
        System.out.print((srcNum % 2 == 0 ? "Четное" : "Нечетное"));
        if (srcNum > 0) {
            System.out.println(", положительное, не ноль.");
        } else if (srcNum < 0) {
            System.out.println(", отрицательное, не ноль.");
        } else {
            System.out.println(", ноль.");
        }
    }

    public static void searchEqualDigitsInNum() {
        // Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах\n");

        int srcNum1 = 289;
        int srcNum2 = 189;
        System.out.println("Исходные числа: " + srcNum1 + " и " + srcNum2);

        if (srcNum1 / 100 == srcNum2 / 100) {
            System.out.println(" Совпали сотни.");
        }

        if (srcNum1 / 10 % 10 == srcNum2 / 10 % 10) {
            System.out.println(" Совпали десятки.");
        }

        if (srcNum1 % 10 == srcNum2 % 10) {
            System.out.println(" Совпали единицы.");
        }
    }

    public static void determineCharTypeByCode() {
        // Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");

        char unknownChar = '\u005A';

        if ((unknownChar >= 'A' && unknownChar <= 'Z') || 
                (unknownChar >= 'А' && unknownChar <= 'Я')) {
                    System.out.println("Символ: '" + unknownChar + "' - большая буква.");
        } else if ((unknownChar >= 'a' && unknownChar <= 'z') || 
                (unknownChar >= 'а' && unknownChar <= 'я')) {
                    System.out.println("Символ: '" + unknownChar + "' - маленькая буква.");
        } else if (unknownChar >= '0' && unknownChar <= '9') {
            System.out.println("Символ: '" + unknownChar + "' - число.");
        } else {
            System.out.println("Символ: '" + unknownChar + "' - не буква и не число.");
        }
    }

    public static void determineBankAccrual() {
        // Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");

        int sumDeposit = 300000;
        int percentDeposit;

        if (sumDeposit < 100000) {
            percentDeposit = 5;
        } else if (sumDeposit <= 300000) {
            percentDeposit = 7;
        } else {
            percentDeposit = 10;
        }

        int sumInterestAccrued = sumDeposit * percentDeposit / 100;
        int sumTotal = sumDeposit + sumInterestAccrued;

        System.out.println("Сумма вклада " + sumDeposit + 
                ", начисленный % " + sumInterestAccrued + 
                ", итоговая сумма с % " + sumTotal);
    }

    public static void determineGradesSubjects() {
        // Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам\n");
        
        int percentHistory = 59;
        int percentProgramming = 91;
        
        System.out.println("Предмет `История`: " + percentHistory + "% - оценка " + 
            getGradeByPercent(percentHistory) + ".");
        System.out.println("Предмет `Программирование`: " + percentProgramming + "% - оценка " + 
            getGradeByPercent(percentProgramming) + ".");
    }

    public static int getGradeByPercent(int percent) {
        int grade;

        /* 
         * Previously I was formatting the code according to the article:
         * 'https://topjava.ru/blog/pravila-formatirovaniya-koda-v-java', item 3.4 'f)'.
        */

        // if (percent <= 60) {
        //     grade = 2;
        // } else if (percent <= 73) {
        //     grade = 3;
        // } else if (percent <= 91) {
        //     grade = 4;
        // } else {
        //     grade = 5;
        // }

        if (percent <= 60) grade = 2;
        else if (percent <= 73) grade = 3;
        else if (percent <= 91) grade = 4;
        else grade = 5;

        return grade;
    }

    public static void calculateProfitLoss() {
        // Расчет прибыли (убытка)
        System.out.println("\n8. Расчет прибыли (убытка)\n");

        int monthCostRental = 5000;
        int monthSumSales = 15000;
        int monthCostGoods = 9000;

        int yearProfitLoss = (monthSumSales - monthCostGoods - monthCostRental) * 12;

        if (yearProfitLoss >= 0) {
            System.out.println("Годовая прибыль: +" + yearProfitLoss + " р");
        } else {
            System.out.println("Годовой убыток: " + yearProfitLoss + " р");
        }
    }

    public static void determineOfExistingTriangle() {
        // Определение существования треугольника
        System.out.println("\n9. Определение существования треугольника\n");

        int lengthSide1 = 3;
        int lengthSide2 = 4;
        int lengthSide3 = 5;

        // A triangle exists if lengths of any 2 sides more than length of third side.
        boolean isTriangleExist = false;
        if ((lengthSide1 + lengthSide2 > lengthSide3) && 
                    (lengthSide1 + lengthSide3 > lengthSide2) && 
                    (lengthSide2 + lengthSide3 > lengthSide1)) {
            isTriangleExist = true;
        }

        if (!isTriangleExist) {
            System.out.println("Треугольник с длинами сторон " + lengthSide1 + ", " + 
                    lengthSide2 + ", " + lengthSide3 + " не существует.");
            return;
        }

        int hypotenuse = lengthSide1;
        int cathetus1 = lengthSide2;
        int cathetus2 = lengthSide3;

        if (lengthSide2 > hypotenuse) {
            hypotenuse = lengthSide2;
        }

        if (lengthSide3 > hypotenuse) {
            hypotenuse = lengthSide3;
        }

        if (hypotenuse == lengthSide2) {
            cathetus1 = lengthSide1;
        } else {
            cathetus1 = lengthSide1;
            cathetus2 = lengthSide2;
        }

        // Hypotenuse is possible only for right triangle. Check it.
        boolean isRrightTriangle = (hypotenuse * hypotenuse == cathetus1 * cathetus1 + 
                cathetus2 * cathetus2);

        if (!isRrightTriangle) {
            System.out.println("Треугольник с длинами сторон " + lengthSide1 + ", " + 
                    lengthSide2 + ", " + lengthSide3 + " не правильный.");
            return;
        }

        int square = (cathetus1 * cathetus2) / 2;
        System.out.println("Площадь треугольника: " + square);

        // I don't know how to draw the triangle without using a loop.
        System.out.println("|\\" + "\n| \\" + "\n|  \\" + "\n|___\\");
    }

    public static void amountBanknotes() {
        // Подсчет количества банкнот
        System.out.println("\n10. Подсчет количества банкнот\n");

        int sumMoney = 567;
        
        int banknoteValue1 = 1;
        int banknoteValue10 = 10;
        int banknoteValue50 = 50;

        int amountBanknote50 = sumMoney / banknoteValue50;
        int amountBanknote10 = sumMoney / banknoteValue50 % banknoteValue10;
        int amountBanknote1 = sumMoney % banknoteValue10;
        int totalSum = amountBanknote50 * banknoteValue50 + amountBanknote10 * banknoteValue10 + 
                amountBanknote1 * banknoteValue1;

        System.out.println("Номинал 50 - " + amountBanknote50 + " шт; " + 
                "\nноминал 10 - " + amountBanknote10 + " шт; " + 
                "\nноминал 1 - " + amountBanknote1 + " шт." + 
                "\nИтого: " + totalSum + ".");
    }
}
