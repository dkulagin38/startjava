package com.startjava.lessons2_3.guess_number_game;

import java.util.Scanner;

public class Player {

    private String name;

    // Accessors & mutators
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Behaviour player's methods
    public String enterName(int serialNum) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя " + serialNum + "-го игрока: ");
        name = scan.nextLine();
        return name;
    }

    public int enterNumber(String playerName) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n" + playerName + ", введите число: ");
        int num = scan.nextInt();
        return num;
    }
}