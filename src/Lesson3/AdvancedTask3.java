package Lesson3;

import java.util.Scanner;

public class AdvancedTask3 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = d.nextInt();
        System.out.println("Введите число b");
        int b = d.nextInt();
        int c = b % a;
        if (c == 0) {
            System.out.println("Число а является делителем числа b");
        } else {
            System.out.println("Число а не является делителем числа b");

        }
    }
}
/*3.Определить, является ли число а делителем числа b*/