package com.example;

import java.util.Scanner;

public class Converter {
    public static void main(String... args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Введите число в 8-ной системе счисления:");
        var octString = scanner.nextLine();

        var dec = Integer.parseInt(octString, 8);
        var hexString = Integer.toString(dec, 16);

        System.out.println("Число в 8-ной системе счисления: " + octString);
        System.out.println("Число в 10-ной системе счисления: " + dec);
        System.out.println("Число в 16-ной системе счисления: " + hexString);
    }
}
