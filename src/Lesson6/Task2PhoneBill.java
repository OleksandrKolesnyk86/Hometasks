package Lesson6;

public class Task2PhoneBill {
    public static void main(String[] args) {
        PhoneBill a = new PhoneBill(9, 300, 40, 10, 10);
        System.out.println("Total phone bill is " + a.getPhoneBill());
    }
}

class PhoneBill {
    private int gigabytes;
    private int minutesUkraine;
    private int smsQuantity;
    private int minutesForeignAreaOne;
    private int minutesForeignAreaTwo;
    private double tax;
    private double phoneBill;

    PhoneBill(int gigabytes, int minutesUkraine, int smsQuantity, int minutesForeignAreaOne, int minutesForeignAreaTwo) {
        this.gigabytes = gigabytes;
        this.minutesUkraine = minutesUkraine;
        this.smsQuantity = smsQuantity;
        this.minutesForeignAreaOne = minutesForeignAreaOne;
        this.minutesForeignAreaTwo = minutesForeignAreaTwo;
        setTax(gigabytes, minutesUkraine, smsQuantity, minutesForeignAreaOne, minutesForeignAreaTwo);
        setPhoneBill(gigabytes, minutesUkraine, smsQuantity, minutesForeignAreaOne, minutesForeignAreaTwo, tax);
        ;
    }

    private void setTax(int gigabytes, int minutesUkraine, int smsQuantity, int minutesForeignAreaOne, int minutesForeignAreaTwo) {
        tax = (internetCost(gigabytes) + callsUkraine(minutesUkraine) + sms(smsQuantity) + foreignCallsAreaTwo(minutesForeignAreaTwo)
                + foreignCallsAreaOne(minutesForeignAreaOne)) / 100 * 7;
    }

    private void setPhoneBill(int gigabytes, int minutesUkraine, int smsQuantity, int minutesForeignAreaOne, int minutesForeignAreaTwo, double tax) {
        phoneBill = internetCost(gigabytes) + callsUkraine(minutesUkraine) + sms(smsQuantity)
                + foreignCallsAreaTwo(minutesForeignAreaTwo)
                + foreignCallsAreaOne(minutesForeignAreaOne) + tax;
    }

    public double getPhoneBill() {
        return phoneBill;

    }

    private int internetCost(int gigabytes) {
        if (gigabytes <= 8) {
            return 0;
        } else {
            return (((gigabytes * 1000) - 8000) / 500) * 50;
        }
    }

    private double callsUkraine(int minutesUkraine) {
        if (minutesUkraine <= 500) {
            return minutesUkraine * 0.5;
        } else {
            return minutesUkraine * 0.75;
        }
    }

    private double sms(int smsQuantity) {
        if (smsQuantity <= 50) {
            return smsQuantity;
        } else {
            return smsQuantity * 1.5;
        }
    }

    private double foreignCallsAreaOne(int minutesForeignAreaOne) {
        if (minutesForeignAreaOne > 0) {
            return minutesForeignAreaOne * 1.5;
        } else {
            return 0;
        }
    }

    private double foreignCallsAreaTwo(int minutesForeignAreaTwo) {
        if (minutesForeignAreaTwo > 0) {
            return minutesForeignAreaTwo * 2;
        } else {
            return 0;
        }
    }
}



/*Рассчитать стоимость пакета в месяц. Инициализацию getPhoneBill сделать с
помощью конструтора из другого класса
1. Стоимость интернета до 8гб включена в пакет, после 50 грн / 500 мб (вход
параметр кол-во потраченных гб)
2. Звонки по Украине до 500 минут 0,5 грн / мин после 0,75
3. Смс до 50 шт 1 грн после 1,50
4. Звонки за рубеж зона 1 1.5 грн/мин
5. Звонки за рубеж зона 2 2 грн/мин
После подсчёта суммы добавляется налог 7 %*/

