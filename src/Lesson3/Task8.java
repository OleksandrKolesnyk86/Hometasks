package Lesson3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите количество совершенных Вами продаж");
        int salesQuantity = a.nextInt();
        int S = 10 - salesQuantity;
        if (salesQuantity > 10) {
            System.out.println("Вы заработали бонус");
        } else {
            System.out.println("Чтобы получить бонус Вам осталось совершить " + S + " продаж");
        }
    }
}
/*8. Написать программу, которая выведет в консоль если количество продаж больше 10
        сообщение что менеджер заработал бонус, если меньше, то выполнит расчёт сколько
        осталось продаж до получения бонуса*/