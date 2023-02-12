package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class DiceGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("""
                Игра Кости.
                Вам необходимо пройти ровно двадцать позиций игрового поля. У вас есть 5 бросков.
                Начнем игру!
                Удачи Вам!
                Чтобы сделать первый бросок введите любое число и нажмите Enter""");
        int first = scanner.nextInt();
        int firstDie = rnd.nextInt(6) + 1;
        System.out.println("Вам выпало число " + firstDie);
        System.out.println("Вы находитесь на " + firstDie + " позиции игрового поля." +
                "\nЧтобы выиграть Вам необходимо пройти еще " + (20 - firstDie) + " позиций.");
        System.out.println("Чтобы сделать второй бросок введите любое число и нажмите Enter");
        int second = scanner.nextInt();
        int secondDie = rnd.nextInt(6) + 1;
        System.out.println("Вам выпало число " + secondDie);
        int position2 = firstDie + secondDie;
        System.out.println("Вы находитесь на " + position2 + " позиции игрового поля." +
                "\nЧтобы выиграть Вам необходимо пройти еще " + (20 - position2) + " позиций.");
        System.out.println("Чтобы сделать третий бросок введите любое число и нажмите Enter");
        int third = scanner.nextInt();
        int thirdDie = rnd.nextInt(6) + 1;
        System.out.println("Вам выпало число " + thirdDie);
        int position3 = position2 + thirdDie;
        System.out.println("Вы находитесь на " + position3 + " позиции игрового поля." +
                "\nЧтобы выиграть Вам необходимо пройти еще " + (20 - position3) + " позиций.");
        System.out.println("Чтобы сделать четвертый бросок любое число и нажмите Enter");
        int fourth = scanner.nextInt();
        int fourthDie = rnd.nextInt(6) + 1;
        System.out.println("Вам выпало число " + fourthDie);
        int position4 = position3 + fourthDie;
        if (position4 == 20) {
            System.out.println("Вы победили, так как достигли конца игрового поля");
        } else if (position4 > 20) {
            System.out.println("Вы проиграли, так Вы вышли за пределы игрового поля");
        } else {
            System.out.println("Вы находитесь на " + position4 + " позиции игрового поля." +
                    "\nЧтобы выиграть Вам необходимо пройти еще " + (20 - position4) + " позиций.");
        }
        System.out.println("Чтобы сделать пятый бросок введите 5 и нажмите Enter");
        int fifth = scanner.nextInt();
        int fifthDie = rnd.nextInt(6) + 1;
        System.out.println("Вам выпало число " + fifthDie);
        int position5 = position4 + fifthDie;
        if (position5 == 20) {
            System.out.println("Поздравляем. Вы победили, так как достигли конца игрового поля.1");
        } else if (position5 > 20) {
            System.out.println("Вы проиграли, так Вы вышли за пределы игрового поля.");
        } else {
            System.out.println("Вы проиграли, так как не достигли конца игрового поля.");
        }
    }
}

