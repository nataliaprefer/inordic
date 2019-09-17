package com.example;

public class AnotherCompareDouble {
    public static void main(String... args) throws Exception {
        var a = 1.000001d;
        var b = 0.000001d;
        var c = 1.0d;
        var eps = 1e-12;
        var sub = a - b - c;
        var negSub = - sub;

        // |a - b - c| < eps
        System.out.println("a - b = " + (a - b));
        System.out.println("c = " + c);
        System.out.println("eps = " + eps);
        System.out.println("a - b - c = " + sub);
        System.out.println("- (a - b - c) = " + negSub);
        System.out.println("a - b - c < eps => " + (sub < eps));
        System.out.println("- (a - b - c) < eps => " + (negSub < eps));
        System.out.println("a - b = c => " + (sub < eps && negSub < eps));
    }
}
