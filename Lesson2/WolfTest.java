public class WolfTest {

    public static void main(String[] args) {
        Wolf primalWolf = new Wolf();
        primalWolf.name = "White fang";
        primalWolf.sex = "Indefinite";
        primalWolf.age = 1;

        // Attributes
        System.out.println("Name: " + primalWolf.name);
        System.out.println("Sex: " + primalWolf.sex);
        System.out.println("Age: " + primalWolf.age);

        // Methods
        primalWolf.move();
        primalWolf.sit();
        primalWolf.run();
        primalWolf.howl();
        primalWolf.hunt();
    }
}