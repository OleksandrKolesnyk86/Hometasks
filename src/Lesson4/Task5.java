package Lesson4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите текст");
        String a = scn.nextLine();
        char[] arr = a.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
     }
}

/*5. Написать программу, которая выводит реверсивную строку
 */