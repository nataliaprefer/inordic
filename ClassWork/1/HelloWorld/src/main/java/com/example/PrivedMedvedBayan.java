package com.example;

import java.util.Scanner;

public class PrivedMedvedBayan {
    public static void main(String... args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Привет, меня зовут Алиса. А как вас зовут?");

        var imya = scanner.nextLine();

        System.out.print("Очень приятно с вами познакомиться, ");
        System.out.print(imya);
        System.out.println(" ;)");
    }
}
