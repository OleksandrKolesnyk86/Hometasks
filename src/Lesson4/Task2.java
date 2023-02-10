package Lesson4;

public class Task2 {
    public static void main(String[] args) {
        int i = 10;
        while (i<=360){
            System.out.println("Синус " + i + " градусов = " + Math.sin(i));
            i = i + 10;
        }
    }
}
/*int[] degree = new int[360];
        for (int i = 1; i <= degree.length - 1; i++) {
            degree[i] = i;
        }
        for (int a = 10; a <= degree.length + 1; a = a + 10) {
            System.out.println("Синус " + a + " градусов = " + Math.sin(a));
        }*/
/*2. Написать программу, которая печатает значения sin(x), где x это каждые 10 градусов
от 0 до 360.
*/
