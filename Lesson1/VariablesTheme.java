public class VariablesTheme {
    public static void main(String[] args) {
        createVariables();
        calculateGoodsValue();
        printTheJavaWord();
        determineMinMaxValues();
        shiftValues();
        printCharsAndCharcodes();
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
        int processorFrequency = 3300;
        long memoryByte = 34359738368l;
        float hddCapacity = 1.81f;
        double averagePercentOfMemoryUsage = 33.4647687684213d;
        char firstNameHDD = 'c';
        boolean isIntelCore = true;

        System.out.println("Количество ядер: " + countOfCores);
        System.out.println("Частота процессора: " + processorFrequency);
        System.out.println("Кэш L3, КБ: " + cacheL3);
        System.out.println("Оперативная память, Б: " + memoryByte);
        System.out.println("Объем жесткого диска, ТБ: " + hddCapacity);
        System.out.println("Имя первого жесткого диска: " + firstNameHDD);
        System.out.println("Процессор семейства Intel: " + isIntelCore);
        System.out.println("Средний процент использования памяти: " + averagePercentOfMemoryUsage);
        // Output of empty divider string
        System.out.println("");
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

        System.out.println("Сумма скидки: " + discountSum + " руб");
        System.out.println("Общая стоимость товаров со скидкой: " + totalDiscountPrice + " руб");
        // Output of empty divider string
        System.out.println("");
    }

    public static void printTheJavaWord() {
        // Вывод на консоль слова JAVA
        System.out.println("3. Вывод на консоль слова JAVA");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        // Output of empty divider string
        System.out.println("");
    }

    public static void determineMinMaxValues() {
        // Отображение min и max значений числовых типов данных
       System.out.println("4. Отображение min и max значений числовых типов данных");

       byte maxByte = 127;
       short maxShort = 32_767;
       int maxInt = 2_147_483_647;
       long maxLong = 9_223_372_036_854_775_807l;

       System.out.println("Максимальное число типа byte: " + maxByte);
       System.out.println("Максимальное число типа short: " + maxShort);
       System.out.println("Максимальное число типа int: " + maxInt);
       System.out.println("Максимальное число типа long : " + maxLong);

        // Output of empty divider string
        System.out.println("");

       // Increment/decrement
       maxByte++;
       System.out.println("Инкрементированное максимальное число типа byte: " + maxByte);
       maxByte--;
       System.out.println("Декрементированное максимальное число типа byte: " + maxByte);

       maxShort++;
       System.out.println("Инкрементированное максимальное число типа short: " + maxShort);
       maxShort--;
       System.out.println("Декрементированное максимальное число типа short: " + maxShort);

       maxInt++;
       System.out.println("Инкрементированное максимальное число типа int: " + maxInt);
       maxInt--;
       System.out.println("Декрементированное максимальное число типа int: " + maxInt);

       maxLong++;
       System.out.println("Инкрементированное максимальное число типа long: " + maxLong);
       maxLong--;
       System.out.println("Декрементированное максимальное число типа long: " + maxLong);
        // Output of empty divider string
        System.out.println("");
    }

    public static void shiftValues() {
        // Перестановка значений переменных
       System.out.println("5. Перестановка значений переменных");
       
       float valueFloat = 1.5f;
       double valueDouble = 3.141592653589793238462643d;
       System.out.println("Исходное значение переменной типа float: " + valueFloat);
       System.out.println("Исходное значение переменной типа double: " + valueDouble);

       double interValue = valueFloat;
       valueFloat = (float) valueDouble;
       valueDouble = interValue;
       System.out.println("Новое значение переменной типа float: " + valueFloat);
       System.out.println("Новое значение переменной типа double: " + valueDouble);
        // Output of empty divider string
        System.out.println("");
    }

    public static void printCharsAndCharcodes() {
        // Вывод символов и их кодов
        System.out.println("6. Вывод символов и их кодов");

        int value1 = 35;
        int value2 = 38;
        int value3 = 64;
        int value4 = 94;
        int value5 = 95;

        System.out.println("Код: " + value1 + " == " + Character.toString(value1));
        System.out.println("Код: " + value2 + " == " + Character.toString(value2));
        System.out.println("Код: " + value3 + " == " + Character.toString(value3));
        System.out.println("Код: " + value4 + " == " + Character.toString(value4));
        System.out.println("Код: " + value5 + " == " + Character.toString(value5));
        // Output of empty divider string
        System.out.println("");
    }

    public static void multiplyAddDigitsOfNumber() {
        // Произведение и сумма цифр числа
        System.out.println("7. Произведение и сумма цифр числа");

        int number = 345;

        /*
        * Unfortunately I don't know how to get digits withot using loop.
        * So far I'm getting the digits just by index of symbol.
        */
        String numberStr = String.valueOf(number);
        char[] digitsChar = numberStr.toCharArray();
        int digit1 = digitsChar[0] - '0';
        int digit2 = digitsChar[1] - '0';
        int digit3 = digitsChar[2] - '0';

        int multiplication = digit1 * digit2 * digit3;
        int addition = digit1 + digit2 + digit3;
        System.out.println("Произведение цифр числа " + number + ": " + multiplication);
        System.out.println("Сумма цифр числа " + number + ": " + addition);
        // Output of empty divider string
        System.out.println("");
    }

    public static void printDukeMascot() {
        // Вывод на консоль ASCII-арт Дюка
        System.out.println("8. Вывод на консоль ASCII-арт Дюка");

        // ASCII character codes
        String strSpace = Character.toString(32);
        String strSlach = Character.toString(47);
        String strBackSlach = Character.toString(92);
        String strLeftParenthesis = Character.toString(40);
        String strRightParenthesis = Character.toString(41);
        String strUnderscore = Character.toString(95);

        String string1 = strSpace + strSpace + strSpace + strSpace + strSlach + strBackSlach;
        String string2 = strSpace + strSpace + strSpace + strSlach + strSpace + strSpace + 
                strBackSlach;
        String string3 = strSpace + strSpace + strSlach + strUnderscore + 
                strLeftParenthesis + strSpace + strRightParenthesis + strBackSlach;
        String string4 = strSpace + strSlach + strSpace + strSpace + strSpace + strSpace + 
                strSpace + strSpace + strBackSlach;
        String string5 = strSlach + strUnderscore + strUnderscore + strUnderscore 
                + strUnderscore + strSlach + strBackSlach + strUnderscore 
                + strUnderscore + strBackSlach;

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
        System.out.println(string5);
        // Output of empty divider string
        System.out.println("");
    }

    public static void determineHundredsTensOnes() {
        // Отображение количества сотен, десятков и единиц числа
        System.out.println("9. Отображение количества сотен, десятков и единиц числа");
        
        int initialValue = 123;

        int hundreds = initialValue / 100;
        int tens = initialValue / 10 - hundreds * 10;
        int ones = initialValue - hundreds * 100 - tens * 10;

        System.out.println("Исходное число: " + initialValue);
        System.out.println("Сотни: " + hundreds);
        System.out.println("Десятки: " + tens);
        System.out.println("Единицы: " + ones);
        // Output of empty divider string
        System.out.println("");
    }

    public static void convertTime() {
        // Преобразование секунд
        System.out.println("10. Преобразование секунд");

        int initialSeconds = 86399;

        /*
        * Anyone knows that 24 hours equal 86400 sec.
        * So I'd expect to get 23 h 59 min 59 sec. 
        */

        // 60 - min/hour, 60 - sec/min.
        int hours = initialSeconds / 60 / 60;
        int minutes = (initialSeconds - hours * 60 * 60) / 60;
        int seconds = initialSeconds - hours * 60 * 60 - minutes * 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}