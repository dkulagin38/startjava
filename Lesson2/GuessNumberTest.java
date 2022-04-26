import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {

    public static void main(String[] args) {

        // The loop: one iteration = one game.
        while(true) {

            Scanner scan = new Scanner(System.in);

            System.out.print("\nВведите имя первого игрока: ");
            String namePlayer1 = scan.nextLine();
            Player player1 = new Player();
            player1.setName(namePlayer1);

            System.out.print("Введите имя второго игрока: ");
            String namePlayer2 = scan.nextLine();
            Player player2 = new Player();
            player2.setName(namePlayer2);

            Random random = new Random();
            int computerNum = random.nextInt(100);
            System.out.print("\n*** This is a secret message, nobody knows that one! *** ");
            System.out.println("The computer invented " + computerNum + ".");

            GuessNumber guessNum = new GuessNumber();

            String playerName;
            int playerNum;

            // The loop for guessing of the computer number.
            while (true) {
                playerName = player1.getName();
                playerNum = player1.enterNum(playerName);
                if (guessNum.NumbersEqual(computerNum, playerNum)) {
                    break;
                } 

                playerName = player2.getName();
                playerNum = player2.enterNum(playerName);
                if (guessNum.NumbersEqual(computerNum, playerNum)) {
                    break;
                }
            }
            
            // The end of game.
            System.out.println("Победил игрок: " + playerName);

            // The loop for answer the question about continue the game.
            while (true) {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                String answer = scan.nextLine();

                if (answer.equals("yes") || answer.equals("y")) {
                    break;
                } else if (answer.equals("no") || answer.equals("n")) {
                    return;
                } else {
                    System.out.println("Некорректный ответ. Попробуйте еще раз.");
                }
            }
        }
    }
}