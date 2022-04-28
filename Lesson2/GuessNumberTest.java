import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        while (true) {
            // The divider of different games.
            System.out.println();
            
            // Enter players' names
            Player player1 = new Player();
            player1.enterName(1);
            Player player2 = new Player();
            player2.enterName(2);

            GuessNumber GuessNumber = new GuessNumber();
            GuessNumber.playGame(player1, player2);

            if (!userWantsToStartNewGame()) {
                break;
            }
        }
    }

    private static boolean userWantsToStartNewGame() {
        String continueMessage = "Хотите продолжить игру? [yes/no]: ";
        System.out.print(continueMessage);

        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();

        while (!(answer.equals("yes") || answer.equals("y") 
            || answer.equals("no") || answer.equals("n"))) {
            System.out.println("Некорректный ответ. Попробуйте еще раз.\n");
            System.out.print(continueMessage);
            answer = scan.nextLine();
        }

        if (answer.equals("yes") || answer.equals("y")) {
            return true;
        } else {
            return false;
        }
    }
}