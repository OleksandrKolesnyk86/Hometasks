package Lesson3;

public class Task7 {
    public static void main(String[] args) {
        int salary = 1000;
        int sales = 20;
        int bonus = 250;
        if (sales > 10) {
            System.out.println("Your salary is " + (salary + bonus));
        } else {
            System.out.println("Your salary is " + salary);
        }
    }
}
/*7. Написать программу, для расчёта зарплаты менеджера по продажам. Если
менеджер совершил более 10 продаж он получает бонус 250$. Базовая ставка 1000$. */