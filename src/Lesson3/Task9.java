package Lesson3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите возраст мужа");
        int husbandAge = a.nextInt();
        System.out.println("Введите возраст жены");
        int wifeAge = a.nextInt();
        if (husbandAge >= 35) {
            if (wifeAge >= 35) {
                System.out.println("Вы получите ипотеку");
            } else {
                System.out.println("Вы не получите ипотеку, потому что  возраст жены должен быть от 35 лет");
            }
        } else {
            System.out.println("Вы не получите ипотеку, потому что  возраст мужа должен быть от 35 лет");
        }
    }
}
/*9. Получение ипотеки
Имеем 2 переменные - возраст мужа и жены
Написать программу, которая выводит в консоль результат.
Задачу решить используя вложенный if (сначала проверить возраст жены, потом мужа)
*/