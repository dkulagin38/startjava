public class GuessNumber {

    public static boolean NumbersEqual(int computerNum, int playerNum) {
        if (playerNum == computerNum) {
            System.out.println("\nВы угадали!");
            return true;
        } else {
            String wordGreaterLess = "больше";
            if (playerNum < computerNum) {
                wordGreaterLess = "меньше";
            }
            System.out.println("Число " + playerNum + " " + wordGreaterLess + 
                    " того, что загадал компьютер.");
            return false;
        }
    }
}
