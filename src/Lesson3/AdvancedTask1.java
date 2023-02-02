package Lesson3;

import java.util.Scanner;

public class AdvancedTask1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите сумму Вашей покупки");
        int purchaseSum = a.nextInt();
        int discont = purchaseSum / 100 * 15;
        int discountEnough = 1000 - purchaseSum;
        if (purchaseSum > 1000) {
            System.out.println("Вам преедоставляется скидка 15%,\n" +
                    " итоговая стоимость вашей покупки = " + (purchaseSum - discont) + " рублей");
        } else {
            System.out.println("Скидка не предоставляется, поскольку стоимость покупки менее 1000 рублей, \n" +
                    " для получений скидки Вам нужно купить товар еще на " + discountEnough + " рублей");
        }
    }
}
/*1.Сумма покупки составляет а рублей. Если а больше 1000 рублей, то предоставляется
скидка 15%. Вывести на экран сумму покупки с учетом скидки либо сообщение о том,
что скидка не предоставляется.*/