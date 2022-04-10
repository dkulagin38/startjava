public class VariablesTheme {
    public static void main(String[] args) {
        createVariables();
        calculateGoodsValue();
        printJavaWord();
        determineMinMaxValues();
        shiftValues();
        printCharsCharcodes();
        multiplyAddDigitsOfNumber();
        printDukeMascot();
        determineHundredsTensOnes();
        convertTime();
    }

    public static void createVariables() {
        // Создание переменных и вывод их значений на консоль
        System.out.println("1. Создание переменных и вывод их значений на консоль");

        byte countOfCores = 4;
        short cacheL3 = 6144;
        int cpuFrequency = 3300;
        long memoryByte = 34359738368l;
        float hddCapacity = 1.81f;
        double averagePercentOfMemoryUsage = 33.4647687684213d;
        char firstNameHdd = 'c';
        boolean isIntelCore = true;

        System.out.println("Количество ядер: " + countOfCores + 
                "\nЧастота процессора: " + cpuFrequency + 
                "\nКэш L3, КБ: " + cacheL3 + 
                "\nОперативная память, Б: " + memoryByte + 
                "\nОбъем жесткого диска, ТБ: " + hddCapacity + 
                "\nИмя первого жесткого диска: " + firstNameHdd + 
                "\nПроцессор семейства Intel: " + isIntelCore + 
                "\nСредний процент использования памяти: " + averagePercentOfMemoryUsage + "\n");
    }

    public static void calculateGoodsValue() {
        // Расчет стоимости товара со скидкой
        System.out.println("2. Расчет стоимости товара со скидкой");

        int priceGoodsX = 100;
        int priceGoodsY = 200;
        int discountPercent = 11;

        /* 
        * The quantity is not specified in the task. 
        * So I don't account the quantity yet.
        */ 
        int totalPrice = priceGoodsX + priceGoodsY;
        int discountSum = totalPrice * discountPercent / 100;
        int totalDiscountPrice = totalPrice - discountSum;

        System.out.println("Сумма скидки: " + discountSum + " руб" + 
                "\nОбщая стоимость товаров со скидкой: " + totalDiscountPrice + " руб\n");
    }

    public static void printJavaWord() {
        // Вывод на консоль слова JAVA
        System.out.println("3. Вывод на консоль слова JAVA");

        System.out.println("   J    a  v     v  a" + 
                "\n   J   a a  v   v  a a" + 
                "\nJ  J  aaaaa  V V  aaaaa" + 
                "\n JJ  a     a  V  a     a" + 
                "\n JJ  a     a  V  a     a\n");
    }

    public static void determineMinMaxValues() {
        // Отображение min и max значений числовых типов данных
        System.out.println("4. Отображение min и max значений числовых типов данных");

        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807l;

        System.out.println("Максимальное число типа byte: " + maxByte + 
                "\nМаксимальное число типа short: " + maxShort + 
                "\nМаксимальное число типа int: " + maxInt + 
                "\nМаксимальное число типа long : " + maxLong + "\n");

        // Increment/decrement
        System.out.println("Инкрементированное максимальное число типа byte: " + ++maxByte + 
                "\nДекрементированное максимальное число типа byte: " + --maxByte + 
                "\nИнкрементированное максимальное число типа short: " + ++maxShort + 
                "\nДекрементированное максимальное число типа short: " + --maxShort + 
                "\nИнкрементированное максимальное число типа int: " + ++maxInt + 
                "\nДекрементированное максимальное число типа int: " + --maxInt + 
                "\nИнкрементированное максимальное число типа long: " + ++maxLong + 
                "\nДекрементированное максимальное число типа long: " + --maxLong + "\n");
    }

    public static void shiftValues() {
        System.out.println("5. Перестановка значений переменных");
       
        float valueFloat = 1.5f;
        double valueDouble = 3.141592653589793238462643d;
        System.out.println("Исходное значение переменной типа float: " + valueFloat + 
                "\nИсходное значение переменной типа double: " + valueDouble);

       double interValue = valueFloat;
       valueFloat = (float) valueDouble;
       valueDouble = interValue;
        System.out.println("Новое значение переменной типа float: " + valueFloat + 
                "\nНовое значение переменной типа double: " + valueDouble + "\n");
    }

    public static void printCharsCharcodes() {
        // Вывод символов и их кодов
        System.out.println("6. Вывод символов и их кодов");

        int codeChar1 = 35;
        int codeChar2 = 38;
        int codeChar3 = 64;
        int codeChar4 = 94;
        int codeChar5 = 95;

        System.out.println("Код: " + codeChar1 + " == " + (char) codeChar1 + 
                "\nКод: " + codeChar2 + " == " + (char) codeChar2 + 
                "\nКод: " + codeChar3 + " == " + (char) codeChar3 + 
                "\nКод: " + codeChar4 + " == " + (char) codeChar4 + 
                "\nКод: " + codeChar5 + " == " + (char) codeChar5 + "\n");
    }

    public static void multiplyAddDigitsOfNumber() {
        // Произведение и сумма цифр числа
        System.out.println("7. Произведение и сумма цифр числа");

        int number = 345;

        int digit1 = number / 100;
        int digit2 = number / 10 - digit1 * 10;
        int digit3 = number % 10;

        int multiplication = digit1 * digit2 * digit3;
        int addition = digit1 + digit2 + digit3;

        System.out.println("Произведение цифр числа " + number + ": " + multiplication + 
                "\nСумма цифр числа " + number + ": " + addition + "\n");
    }

    public static void printDukeMascot() {
        // Вывод на консоль ASCII-арт Дюка
        System.out.println("8. Вывод на консоль ASCII-арт Дюка");

        // ASCII character codes
        char space = (char) 32;
        char slash = (char) 47;
        char backslash = (char) 92;
        char lBracket = (char) 40;
        char rBracket = (char) 41;
        char underscore = (char) 95;

        System.out.println("" + space + space + space + space + slash + backslash + "\n" + 
                space + space + space + slash + space + space + backslash + "\n" + 
                space + space + slash + underscore + lBracket + space + rBracket 
                + backslash + "\n" + 
                space + slash + space + space + space + space + space + space + backslash + "\n" + 
                slash + underscore + underscore + underscore + underscore + 
                slash + backslash + underscore + underscore + backslash + "\n");
    }

    public static void determineHundredsTensOnes() {
        // Отображение количества сотен, десятков и единиц числа
        System.out.println("9. Отображение количества сотен, десятков и единиц числа");
        
        int totalValue = 123;

        int hundreds = totalValue / 100;
        int tens = totalValue / 10 - hundreds * 10;
        int ones = totalValue % 10;

        System.out.println("Исходное число: " + totalValue + "\nСотни: " + hundreds + 
                "\nДесятки: " + tens + "\nЕдиницы: " + ones + "\n");
    }

    public static void convertTime() {
        // Преобразование секунд
        System.out.println("10. Преобразование секунд");

        int totalSeconds = 86399;

        /*
        * Anyone knows that 24 hours equal 86400 sec.
        * So I'd expect to get 23 h 59 min 59 sec. 
        */

        // 60 - min/hour, 60 - sec/min.
        int hours = totalSeconds / 60 / 60;
        int minutes = (totalSeconds - hours * 60 * 60) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}