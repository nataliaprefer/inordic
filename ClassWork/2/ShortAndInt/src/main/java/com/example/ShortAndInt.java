package com.example;

public class ShortAndInt {
    public static void main(String... args) throws Exception {
        var firstNumber = (short)534;
        var secondNumber = (short)32700;

        var shortSum = (short)(firstNumber + secondNumber);
        var intSum = (int)(firstNumber + secondNumber);

        System.out.println("Сумма в типе short: " + shortSum);
        System.out.println("Сумма в типе int: " + intSum);
    }
}
