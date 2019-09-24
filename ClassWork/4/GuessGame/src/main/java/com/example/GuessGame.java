package com.example;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String... args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Привет! Я загадал число от 0 до 9. Попробуйте отгадать его))");
        var random = new Random().nextInt(10);

        var count = 1;
        var human = scanner.nextInt();
        while (human != random) {
            if (human < random) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }

            human = scanner.nextInt();
            count = count + 1;
        }

        System.out.println("Поздравляю! Вы отгадали число! Кол-во попыток: " + count);
    }
}
