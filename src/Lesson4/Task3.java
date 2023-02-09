package Lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rnd = new Random();
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = rnd.nextInt(20);
        }
        // boolean a = false;
        for (int a = 0; a < array.length; a++) {
            for (int b = array.length - 1; b > a; b--) {
                if (array[b - 1] > array[b]) {
                    int c = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = c;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

// Arrays.sort(array);
//  System.out.println(Arrays.toString(array));

/*3. Написать программу, которая сортирует массив от минимума в максимум*/