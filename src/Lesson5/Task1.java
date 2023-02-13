package Lesson5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverseMassive(array);
        System.out.println(Arrays.toString(array));
    }

    static void reverseMassive(int... nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            int v = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = v;
        }
        //System.out.println(Arrays.toString(nums));
    }
}
/*A - Написать метод (void) который переворачивает массив.
В main должен быть вызван метод который переворачивает массив, потом
вывести с помощью sout. Важно - не вывести в консоль с последнего элемента, а
проапдейтить существующий массив с помощью void*/