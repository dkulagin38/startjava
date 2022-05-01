package com.startjava.lessons2_3.guess_number_game;

import java.util.Scanner;

public class Player {

    private String name = "";
    private int num = 0;

    // Accessors & mutators
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

    public void enterNumber(String playerName) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n" + playerName + ", введите число: ");
        num = scan.nextInt();
    }
}