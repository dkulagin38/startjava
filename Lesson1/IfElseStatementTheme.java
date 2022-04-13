public class IfElseStatementTheme {
    public static void main(String[] args) {
        transferPseudocodeToJava();
        findMaxMinNumber();
        defineNumber();
        searchEqualDigitsInNumber();
        defineCharTypeByCode();
        getDataOfBankDeposits();
        defineGradesClasses();
        calculateProfitLoss();
        defineOfExistingTriangle();
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

    public static void findMaxMinNumber() {
        // Поиск максимального и минимального числа
        System.out.println("\n2. Поиск максимального и минимального числа\n");

        int srcNumber1 = 123;
        int srcNumber2 = 789;

        int maxNumber;
        int minNumber;

        if (srcNumber1 > srcNumber2) {
            maxNumber = srcNumber1;
            minNumber = srcNumber2;
        } else if (srcNumber1 < srcNumber2) {
            maxNumber = srcNumber2;
            minNumber = srcNumber1;
        } else {
            System.out.println("Исходные числа: " + srcNumber1 + " и " + srcNumber2 + 
                    ".\nНет максимального/минимального числа.");
            return;
        }

        System.out.println("Исходные числа: " + srcNumber1 + " и " + srcNumber2 + 
                ".\nМаксимальное число: " + maxNumber + ", минимальное число: " + minNumber + ".");
    }

    public static void defineNumber() {
        // Работа с числом
        System.out.println("\n3. Работа с числом\n");

        int srcNumber = -124;

        /*
         * I didn't use boolean types (e.g. isEven, isNegative, isZero)
         * because I'd like to print text messages (e.g. "четное", "нечетное").
        */

        String attributeOddEven = "нечетное";
        if (srcNumber % 2 == 0) {
            attributeOddEven = "четное";
        }

        String attributePositiveNegative = "-";
        String attributeZero = "-";
        if (srcNumber < 0) {
            attributePositiveNegative = "отрицательное";
        } else if (srcNumber > 0) {
            attributePositiveNegative = "положительное";
        } else {
            attributeZero = "ноль";
        }

        System.out.println("Исходное число: " + srcNumber + 
                "\nчетное/нечетное: " + attributeOddEven + "; " + 
                "\nотрицательное/положительное: " + attributePositiveNegative + "; " + 
                "\nноль: " + attributeZero + ".");
    }

    public static void searchEqualDigitsInNumber() {
        // Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах\n");

        int srcNumber1 = 289;
        int srcNumber2 = 189;
        System.out.println("Исходные числа: " + srcNumber1 + " и " + srcNumber2);

        if (srcNumber1 / 100 == srcNumber2 / 100) {
            System.out.println(" Совпали сотни.");
        }

        if (srcNumber1 / 10 % 10 == srcNumber2 / 10 % 10) {
            System.out.println(" Совпали десятки.");
        }

        if (srcNumber1 % 10 == srcNumber2 % 10) {
            System.out.println(" Совпали единицы.");
        }
    }

    public static void defineCharTypeByCode() {
        // Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");

        char srcCharacter = '\u005A';
        int codeChar = (int) srcCharacter;

        boolean isUpperCaseLetter = false;
        boolean isLowerCaseLetter = false;
        boolean isDigit = false;

        if ((codeChar >= 65 && codeChar <= 90) || (codeChar >= 128 && codeChar <= 159)) {
            isUpperCaseLetter = true;
        } else if ((codeChar >= 97 && codeChar <= 122) || (codeChar >= 160 && codeChar <= 175) 
                || (codeChar >= 224 && codeChar <= 241)) {
            isLowerCaseLetter = true;
        } else if (codeChar >= 48 && codeChar <= 57) {
            isDigit = true;
        }

//        boolean isAnotherChar = !(isUpperCaseLetter || isLowerCaseLetter || isDigit);

        String charInformation;
        if (isUpperCaseLetter) {
            charInformation = "большая буква";
        } else if (isLowerCaseLetter) {
            charInformation = "маленькая буква";
        } else if (isDigit) {
            charInformation = "число";
        } else {
            charInformation = "не буква и не число";
        }

        System.out.println("Character: " + srcCharacter + " - " + charInformation + ".");
    }

    public static void getDataOfBankDeposits() {
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

    public static void defineGradesClasses() {
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

        if (percent <= 60) {
            grade = 2;
        } else if (percent <= 73) {
            grade = 3;
        } else if (percent <= 91) {
            grade = 4;
        } else {
            grade = 5;
        }

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
            System.out.println("Годовой убыток: " + (-yearProfitLoss) + " р");
        }
    }

    public static void defineOfExistingTriangle() {
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
        int cathetus1;
        int cathetus2;

        if (lengthSide2 > hypotenuse) {
            hypotenuse = lengthSide2;
        }

        if (lengthSide3 > hypotenuse) {
            hypotenuse = lengthSide3;
        }

        if (hypotenuse == lengthSide1) {
            cathetus1 = lengthSide2;
            cathetus2 = lengthSide3;
        } else if (hypotenuse == lengthSide2) {
            cathetus1 = lengthSide1;
            cathetus2 = lengthSide3;
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
        int amountBanknote10 = (sumMoney - amountBanknote50 * banknoteValue50) / banknoteValue10;
        int amountBanknote1 = sumMoney - amountBanknote50 * banknoteValue50 - 
                amountBanknote10 * banknoteValue10;
        int totalSum = amountBanknote50 * banknoteValue50 + amountBanknote10 * banknoteValue10 + 
                amountBanknote1 * banknoteValue1;

        System.out.println("Номинал 50 - " + amountBanknote50 + " шт; " + 
                "\nноминал 10 - " + amountBanknote10 + " шт; " + 
                "\nноминал 1 - " + amountBanknote1 + " шт." + 
                "\nИтого: " + totalSum + ".");
    }
}
