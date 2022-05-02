package com.startjava.lessons2_3.guess_number_game;

public class Player {

    private String name;
    private int num;

    public Player(String name) {
        this.name = name;
    }

    // Accessors & mutators
    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}