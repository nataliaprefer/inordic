package com.example;

import java.util.Scanner;

public class IfOperator {
    public static void main(String... args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Введите любое число из диапозона [0; 10]");
        var a = scanner.nextInt();

        if (a < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else if (a <= 10) { // a >= 0 можно не писать, так как мы уже знаем, что a не меньше нуля
            System.out.println("Ответ: " + (2 * a));
        } else if (a < 100) { // a > 10 можно не писать, так как мы уже знаем, что a не меньше 10
            System.out.println("Вы немного промахнулись ;)");
        } else { // a >= 100 можно не писать, так как мы уже знаем, что a не меньше 100
            System.out.println("Вы сильно промахнулись :(");
        }
    }
}
