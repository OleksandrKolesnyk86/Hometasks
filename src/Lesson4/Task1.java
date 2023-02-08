package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int size = scan.nextInt();
        int[] numbers = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(300);
            System.out.print(numbers[i] + " ");
        }
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("\nМинимальное значение массива = " + min);
    }
}
//another way

/*1. Написать программу, которая находит минимальное значение в массиве*/