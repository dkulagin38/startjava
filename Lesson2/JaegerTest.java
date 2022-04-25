public class JaegerTest {
    
    public static void main(String[] args) {
        // Jaeger 1
        Jaeger jaegerOne = new Jaeger();

        jaegerOne.setModelName("Bracer Phoenix");
        jaegerOne.setMark("Mark-5");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(70.7f);
        jaegerOne.setWeight(2.1f);
        jaegerOne.setSpeed(3);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(9);

        System.out.println("modelName = " + jaegerOne.getModelName());
        System.out.println("mark = " + jaegerOne.getMark());
        System.out.println("speed = " + jaegerOne.getSpeed());
        jaegerOne.drift();

        // Jaeger 2
        Jaeger jaegerTwo = new Jaeger();

        jaegerTwo.setModelName("Apex");
        jaegerTwo.setMark("Mark-6");
        jaegerTwo.setOrigin("USSR");
        jaegerTwo.setHeight(99.9f);
        jaegerTwo.setWeight(1.8f);
        jaegerTwo.setSpeed(18);
        jaegerTwo.setStrength(54);
        jaegerTwo.setArmor(12);

        System.out.println("\nmodelName = " + jaegerTwo.getModelName());
        System.out.println("mark = " + jaegerTwo.getOrigin());
        System.out.println("speed = " + jaegerTwo.getHeight());
        System.out.println("scanKaiju = " + jaegerTwo.scanKaiju());
    }
}