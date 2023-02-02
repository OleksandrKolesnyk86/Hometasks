package Lesson3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите номер пальца");
        int fingerNumber = a.nextInt();
        switch (fingerNumber) {
            case 1:
                System.out.println("Это большой палец");
                break;
            case 2:
                System.out.println("Это указательный палец");
                break;
            case 3:
                System.out.println("Это средний палец");
                break;
            case 4:
                System.out.println("Это безымянный палец");
                break;
            case 5:
                System.out.println("Это мизинец");
                break;
            default:
                System.out.println("Такого пальца не существует");
        }
    }
}
/*10. Написать метод, используя switch, который принимает в себя номер пальца -
переменную типа int и в зависимости от номер выводит название пальца (1-”большой”
и т д)
*/