package Lesson3;

import java.util.Scanner;

public class AdvancedTask4 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Введите число");
        int a = d.nextInt();
        if (a > -5 && a < 3) {
            System.out.println("Число " + a + " принадлежит интервалу (-5;3)");
        } else {
            System.out.println("Число " + a + " не принадлежит интервалу (-5;3)");
        }
    }
}
/*.Проверить, принадлежит ли число введенное с клавиатуры, интервалу (-5;3)*/