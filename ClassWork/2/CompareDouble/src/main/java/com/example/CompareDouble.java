package com.example;

public class CompareDouble {
    public static void main(String... args) throws Exception {
        var a = 1.000001d;
        var b = 0.000001d;
        var c = 1.0d;
        var eps = 1e-12;
        var compare = Math.abs(a - b - c) < eps;

        // |a - b - c| < eps
        System.out.println("a - b = " + (a - b));
        System.out.println("c = " + c);
        System.out.println("eps = " + eps);
        System.out.println("a - b = c => " + compare);
    }
}
