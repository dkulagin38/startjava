import java.util.Scanner;

public class Player {

    private String name;
    private int num;

    // Accessors & Mutators
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    // The main methods
    public int enterNum(String playerName) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n" + playerName + ", введите число: ");
        int num = scan.nextInt();
        return num;
    }
}