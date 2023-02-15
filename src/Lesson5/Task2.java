package Lesson5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество отработаных часов");
        int hours = scn.nextInt();
        System.out.println("Введите базовую ставку за час работы");
        double rate = scn.nextDouble();
        System.out.println("Введите Ваш стаж роботы");
        int workExperience = scn.nextInt();
        System.out.println("Введите количество совершенных Вами продаж");
        int salesQuantity = scn.nextInt();
        System.out.println("Введите сумму совершенных Вами продаж");
        double salesSum = scn.nextDouble();
        double totalSalary  = (salaryHours(hours, rate) + ((experienceHours(workExperience) * 160
                * rate)) + bonusSalesQuantity(salesQuantity) + bonusSalesSum(salesSum));
        System.out.println("Ваша зарплата " + totalSalary);
    }

    static double salaryHours(int hours, double rate) {
        // int a = 160;
        if (hours <= 160) {
            return rate * 160;
        } else {
            return rate * 160 + (hours - 160) * (rate * 1.5);
        }
    }

    static double experienceHours(int workExperience) {
        if (workExperience < 2) {
            return 1;
        } else if (workExperience >= 2 && workExperience < 4) {
            return 1.2;
        } else if (workExperience >= 4 && workExperience < 6) {
            return 1.3;
        } else {
            return 1.4;
        }
    }


    static double bonusSalesQuantity(int salesQuantity) {
        if (salesQuantity < 10) {
            return -150;
        } else if (salesQuantity > 20) {
            return 250;
        } else return 0;
    }

    static double bonusSalesSum(double salesSum) {
        if (salesSum > 15000) {
            return 250;
        } else return 0;
    }
}








/*B - Расчёт зарплаты агента по продажам
Расчёт зарплаты нужно разбить на несколько методов
1. Первый метод получает количество отработанных часов и базовую
ставку. если количество отработанных часов больше 160 то каждый
последующий час по коэф 1,5 (параметры у метода - входящие часы int, и double
rate) , возвращаемое значение - зарплата. Это должна быть сумма базовой
зарплаты (до 160 часов) + бонус за переработку свыше 160 часов (если
переработка была) (double)
2. Второй метод - получает коэффициент на базовые часы (которые до 160) в
зависимости от стажа работы (параметры у метода - стаж работы int, возвращаемое
значение double коэффициент) до 2 лет 1 от 2 до 4 - 1.2 от 4 до 6 - 1.3 от 6 лет - 1.4
3. В зависимости от количества продаж - больше 20 - бонус 250, меньше 10
штраф 150 (параметры у метода - количество продаж int, возвращаемое значение
double бонус за количество продаж)
4. четвертый в зависимости от суммы продаж больше 15000 $ - тоже
добавляется бонус (параметры у метода - сумма продаж double, возвращаемое
значение double бонус за сумму продаж)
В методе main проинициализировать все нужные переменные, вызвать методы
и сделать расчет. Результат вывести в консоль*/