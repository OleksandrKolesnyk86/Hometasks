package Lesson4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {

        int[] a = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(20);
            System.out.print(a[i] + " ");
        }
        int q = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 == 0 && a[j] % 3 != 0) {
                q++;
                //    System.out.println(" " + a[j]);
            }
        }
        System.out.println("\nКоличество элементов массива, которые делятся на 2, но не делятся на 3, равно " + q);
    }
}
/*6. Написать программу, которая подсчитывает количество элементов массива int*ов,
которые делятся на 2, но не делятся на 3 и выводит в консоль*/