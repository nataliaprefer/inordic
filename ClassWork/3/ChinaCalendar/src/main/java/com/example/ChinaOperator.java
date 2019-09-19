package com.example;

import java.util.Scanner;

public class ChinaOperator {
    public static void main(String... args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Введите год, и мы скажем что это за год по китайскому гороскопу)))");
        var year = scanner.nextInt();

        String element, animal;
        switch (year % 10) {
            case 0:
            case 1: {
                element = "Металл";
                break;
            }
            case 2:
            case 3: {
                element = "Вода";
                break;
            }
            case 4:
            case 5: {
                element = "Дерево";
                break;
            }
            case 6:
            case 7: {
                element = "Огонь";
                break;
            }
            case 8:
            case 9: {
                element = "Земля";
                break;
            }
            default: {
                element = "?";
                System.out.println("Что-то пошло не так((((");
            }
        }

        switch (year % 12) {
            case 0: {
                animal = "Обезьяна";
                break;
            }
            case 1: {
                animal = "Петух";
                break;
            }
            case 2: {
                animal = "Собака";
                break;
            }
            case 3: {
                animal = "Свинья";
                break;
            }
            case 4: {
                animal = "Мышь";
                break;
            }
            case 5: {
                animal = "Бык";
                break;
            }
            case 6: {
                animal = "Тигр";
                break;
            }
            case 7: {
                animal = "Кролик";
                break;
            }
            case 8: {
                animal = "Дракон";
                break;
            }
            case 9: {
                animal = "Змея";
                break;
            }
            case 10: {
                animal = "Лошадь";
                break;
            }
            case 11: {
                animal = "Овца";
                break;
            }
            default: {
                animal = "?";
                System.out.println("Что-то пошло не так((((");
            }
        }

        System.out.println("Вы по китайскому гороскопу: " + animal + "-" + element);
    }
}
