package Lesson3;

public class Task4PrintDayInWord {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("Sunday");
                num++;
            case 2:
                System.out.println("Monday");
                num++;
            case 3:
                System.out.println("Tuesday");
                num++;
            case 4:
                System.out.println("Wednesday");
                num++;
            case 5:
                System.out.println("Thursday");
                num++;
            case 6:
                System.out.println("Friday");
                num++;
            case 7:
                System.out.println("Saturday");
                num++;
            default:
                System.out.println("Not a valid day");
        }
    }
}
/*
import java.util.Scanner;

//Another way
public class Task4PrintDayInWord {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите число дня недели");
        int num = a.nextInt();
        if (num == 1) {
            System.out.println("Sunday");
        }
        if (num == 2) {
            System.out.println("Monday");
        }
        if (num == 3) {
            System.out.println("Tuesday");
        }
        if (num == 4) {
            System.out.println("Wednesday");
        }
        if (num == 5) {
            System.out.println("Thursday");
        }
        if (num == 6) {
            System.out.println("Friday");
        }
        if (num == 7) {
            System.out.println("Saturday");
        }
        if (num > 7 || num < 1) {
            System.out.println("Not a valid day");
        }
    }
}
*/
