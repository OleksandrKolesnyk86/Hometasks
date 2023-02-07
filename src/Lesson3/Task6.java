package Lesson3;

public class Task6 {
    public static void main(String[] args) {
        float a = 0;
        float b = 1;
        //int x = -b / a;
        if (a == 0 || b == 0) {
            System.out.println("Переменные не могут иметь нулевое значение");
        } else {
            System.out.println("x = " + (-b / a));
        }
    }
}
/*6. Написать программу, которая бы решала уравнение вида a*x + b = 0 Переменные a
        и b можно задать вручную. Далее нужно будет посчитать и вывести значение “х”.
        Программа должна также учитывать варианты, когда или а = 0 или b = 0*/

