package com.startjava.lesson1.firstapp;

import java.nio.charset.Charset;
import java.util.Scanner;

public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Написано однажды, работает везде");
//        System.out.println(Charset.defaultCharset().displayName());
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("Введите свое имя: ");
        System.out.print(console.nextLine());
    }
}   