package Lesson10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double[] a = new double[5];
        System.out.println("Введите по очереди 5 чисел, каждый ввод подтвердите кнопкой Enter");
        for (int i = 0; i < a.length; i++) {
            try {
                a[i] = scn.nextDouble();
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Вы ввели другой символ, введите число и нажмите Enter");
                scn.nextLine();
                i--;
            }
        }
        getSum(a);

    }

    static void getSum(double... nums) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("The sum is " + sum);
    }
}

/*1. Написать в main метод который вычисляет сумму 5 double. Получает он их со
сканера. Сделать это в цикле for. Если пользователь вводит неверный тип
данных - эта ошибка обрабатывается - выводится в консоль инфо и программа
продолжает свое действие. Важно чтобы даже если число суммируемых чисел
было 5 (т е если пользователь ввел неверное знач, то счетчик не
увеличивается)*/