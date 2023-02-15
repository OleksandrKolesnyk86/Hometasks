package Lesson5;

public class Task3 {
    public static void main(String[] args) {
        int gigabytes = 9;
        int minutesUkraine = 300;
        int smsQuantity = 40;
        int minutesForeignAreaOne = 10;
        int minutesForeignAreaTwo = 10;
        double tax;
        tax = (internetCost(gigabytes) + callsUkraine(minutesUkraine) + sms(smsQuantity) + foreignCallsAreaTwo(minutesForeignAreaTwo)
                + foreignCallsAreaOne(minutesForeignAreaOne)) / 100 * 7;
        double totalPhoneBill = internetCost(gigabytes) + callsUkraine(minutesUkraine) + sms(smsQuantity)
                + foreignCallsAreaTwo(minutesForeignAreaTwo)
                + foreignCallsAreaOne(minutesForeignAreaOne) + tax;
        System.out.println("Total phone bill is " + totalPhoneBill);
    }

    static int internetCost(int gigabytes) {
        if (gigabytes <= 8) {
            return 0;
        } else {
            return (((gigabytes * 1000) - 8000) / 500) * 50;
        }
    }

    static double callsUkraine(int minutesUkraine) {
        if (minutesUkraine <= 500) {
            return minutesUkraine * 0.5;
        } else {
            return minutesUkraine * 0.75;
        }
    }

    static double sms(int smsQuantity) {
        if (smsQuantity <= 50) {
            return smsQuantity;
        } else {
            return smsQuantity * 1.5;
        }
    }

    static double foreignCallsAreaOne(int minutesForeignAreaOne) {
        if (minutesForeignAreaOne > 0) {
            return minutesForeignAreaOne * 1.5;
        } else {
            return 0;
        }
    }

    static double foreignCallsAreaTwo(int minutesForeignAreaTwo) {
        if (minutesForeignAreaTwo > 0) {
            return minutesForeignAreaTwo * 2;
        } else {
            return 0;
        }
    }
}
/*3 - Счет за телефон
Рассчитать стоимость пакета в месяц. Расчёт по каждому из параметров
сделать в отдельном методе. Потом общий подсчёт провести в методе main и вывести
в консоль c помощью sout
1. Стоимость интернета до 8гб включена в пакет, после 50 грн / 500 мб
(вход параметр кол-во потраченных гб)
2. Звонки по Украине до 500 минут 0,5 грн / мин после 0,75
3. Смс до 50 шт 1 грн после 1,50
4. Звонки за рубеж зона 1 1.5 грн/мин
5. Звонки за рубеж зона 2 2 грн/мин
После подсчёта суммы добавляется налог 7 %*/