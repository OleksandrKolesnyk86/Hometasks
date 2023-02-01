package Lesson3;

import java.util.Scanner;

public class Task2CheckOddEven {
    public static void main(String[] args) {
        String b = ("Odd Number");
        String c = ("Even Number");
        Scanner a = new Scanner(System.in);
        System.out.println("Введите число");
        int number = a.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is " + c);
        } else {
            System.out.println(number + " is " + b);
        }
        System.out.println("BYE");
    }
}
/*2.Написать программу с названием “CheckOddEven”, которая печатает “Odd Number”
        если переменная “number” типа int нечетная. Или “Even Number” если переменная
        четная. Программа всегда должна перед выходом печатать “BYE”*/