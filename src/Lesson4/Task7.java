package Lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(30);
            System.out.print(arr[i] + " ");
        }
        int v;
        for (int i = 0; i < arr.length / 2; i++) {
            v = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = v;
        }
        System.out.println("\n " + Arrays.toString(arr));
    }

}


/*7. Написать программу, который переворачивает массив*/