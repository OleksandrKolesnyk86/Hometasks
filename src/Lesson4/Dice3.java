package Lesson4;

import java.util.Random;

public class Dice3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int finish = 20;
        int position = 0;
        for (int i = 1; i < 6; i++) {
            int die = rnd.nextInt(6) + 1;
            position = position + die;
            System.out.println("Ваше число " + die);
            if (position == finish) {
                System.out.println("Игра окончена, Вы выиграли!");
                break;
            } else if (position > finish) {
                System.out.println("Игра окончена, Вы проиграли, потому что вышли за пределы игрового поля.");
                break;
            }
            if (i == 5) {
                System.out.println("Игра окончена, Вы проиграли, потому что не дошли до конца игрового поля.");
                break;
            }
            System.out.println("Вы находитесь на " + position + " позиции поля." +
                    " \nЧтобы выиграть Вам осталось пройти " + (finish - position) + " позиций");
        }

    }
}
