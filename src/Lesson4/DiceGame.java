package Lesson4;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] die = new int[5];
        for (int i = 0; i < die.length; i++) {
            die[i] = rnd.nextInt(6) + 1;
        }
        int a = 0;
        for (int j : die) {
            a = a + j;
            System.out.println("Ваше число " + j);
            if (a == 20) {
                System.out.println("Игра окончена, Вы выиграли!");
                break;
            } else if (a > 20) {
                System.out.println("Игра окончена, Вы проиграли, потому что вышли за пределы игрового поля.");
                break;
            }
            System.out.println("Вы находитесь на " + a + " позиции поля." +
                    " \nЧтобы выиграть Вам осталось пройти " + (20 - a) + " позиций");
        }
        if (a < 20) {
            System.out.println("Игра окончена, Вы проиграли, потому что не дошли до конца игрового поля.");
        }
    }
}
/*Игра “Кости”
1. Бросьте кубик за пользователя (сгенерируйте случайное число от 1 до 6) и
продвиньте пользователя на это количество делений на игровом поле.
код который возвращает рандомное число от 1 до 6
Random random = new Random();
int die = random.nextInt(6) + 1;
2. После каждого броска вывести инфо в консоль пользователю, на каком игровом
поле он находится и сколько еще мест ему нужно пройти, чтобы выиграть.
3. Всего 5 бросков
4. Если пользователь набирает 20 до 5 бросков, завершите игру - он выиграл.
5. Если пользователь набирает больше или меньше 20 точно, то он проигрывает.
6. Помните, что на доске всего 20 делений, поэтому сообщение типа «Вы
продвинулись на позицию 22» - это баг)*/
