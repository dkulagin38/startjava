public class WolfTest {

    public static void main(String[] args) {
        Wolf primalWolf = new Wolf();
        primalWolf.setName("White fang");
        primalWolf.setSex("Indefinite");
        primalWolf.setAge(9);
        primalWolf.setWeight(88);

        // Instance variables
        System.out.println("Name: " + primalWolf.getName());
        System.out.println("Sex: " + primalWolf.getSex());
        System.out.println("Age: " + primalWolf.getAge());
        System.out.println("Weight: " + primalWolf.getWeight());

        // Methods
        primalWolf.move();
        primalWolf.sit();
        primalWolf.run();
        primalWolf.howl();
        primalWolf.hunt();
    }
}