public class GuessNumber {
    public static void main(String[] args) {
        // A computer input "random" value of number (an integer from 0 to 100)
        int srcNum = 85;
        // A person input "random" value of number
        int guessNum = 51;
        // Variables
        int halfDelta;

        while (guessNum != srcNum) {
            if (guessNum > srcNum) {
                System.out.println("Введенное вами число: " + guessNum + 
                        " больше того, что загадал компьютер загадал: " + srcNum);
                // A person input "random" value of number
                halfDelta = (guessNum - srcNum) / 2;
                if (halfDelta == 0) halfDelta = 1;
                guessNum = guessNum - halfDelta;
            } else {
                System.out.println("Введенное вами число: " + guessNum + 
                        " меньше того, что загадал компьютер загадал: " + srcNum);
                // A person input "random" value of number
                halfDelta = (srcNum - guessNum) / 2;
                if (halfDelta == 0) halfDelta = 1;
                guessNum = guessNum + halfDelta;
            }
        }

        System.out.println("Вы угадали: " + guessNum + " = " + srcNum);
    }
}