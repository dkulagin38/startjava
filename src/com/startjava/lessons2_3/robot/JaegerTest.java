package com.startjava.lessons2_3.robot;

public class JaegerTest {
    
    public static void main(String[] args) {
        // Jaeger 1
        Jaeger jaegerOne = new Jaeger("Bracer Phoenix", "Mark-5", "USA", 70.7f, 2.1f, 3, 8, 9);
        System.out.println("modelName = " + jaegerOne.getModelName());
        System.out.println("mark = " + jaegerOne.getMark());
        System.out.println("speed = " + jaegerOne.getSpeed());
        jaegerOne.drift();

        // Jaeger 2
        Jaeger jaegerTwo = new Jaeger("Apex", "Mark-6", "USSR", 99.9f, 1.8f, 18, 54, 12);
        System.out.println("\nmodelName = " + jaegerTwo.getModelName());
        System.out.println("mark = " + jaegerTwo.getOrigin());
        System.out.println("speed = " + jaegerTwo.getHeight());
        System.out.println("scanKaiju = " + jaegerTwo.scanKaiju());
    }
}