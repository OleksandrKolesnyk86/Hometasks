package Lesson4;

public class Task2 {
    public static void main(String[] args) {
        int[] degrees = new int[360];
        for (int i = 1; i <= degrees.length - 1; i++) {
            degrees[i] = i;
        }
        for (int a = 10; a <= degrees.length +1; a = a + 10) {
            System.out.println("Синус " + a + " градусов = " + Math.sin(a));
        }
    }
}
/*2. Написать программу, которая печатает значения sin(x), где x это каждые 10 градусов
от 0 до 360.
*/
