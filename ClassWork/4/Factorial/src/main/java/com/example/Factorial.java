package com.example;

import java.util.Scanner;

public class Factorial {
    public static void main(String... args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Введите число n для вычисления факториала");
        var n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else if (n > 12) {
            System.out.println("Вы ввели слишком большое число");
        } else {
            var result = 1;
            for (var i = 1; i <= n; i += 1) {
                result = result * i;
            }
            System.out.println(n + "! = " + result);
        }
    }
}
