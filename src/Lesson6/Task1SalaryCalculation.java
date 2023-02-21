package Lesson6;

public class Task1SalaryCalculation {
    public static void main(String[] args) {

        SalesAgentSalary a = new SalesAgentSalary(180, 40);
        SalesAgentSalary b = new SalesAgentSalary(190, 50, 4, 50, 40000);
        System.out.println(a.getSalary());
        System.out.println(b.getSalary());
    }
}

class SalesAgentSalary {
    private int hours;
    private double rate;
    private int workExperience;
    private int salesQuantity;
    private double salesSum;
    private double salary;

    SalesAgentSalary(int hours, double rate) {
        this.hours = hours;
        this.rate = rate;
        setSalary(hours, rate);
    }

    SalesAgentSalary(int hours, double rate, int workExperience, int salesQuantity, double salesSum) {
        this.hours = hours;
        this.rate = rate;
        this.workExperience = workExperience;
        this.salesQuantity = salesQuantity;
        this.salesSum = salesSum;
        setSalary(hours, rate, workExperience, salesQuantity, salesSum);
    }

    private void setSalary(int hours, double rate) {
        salary = salaryHours(hours, rate);
    }

    private void setSalary(int hours, double rate, int workExperience, int salesQuantity, double salesSum) {
        salary = (salaryHours(hours, rate) + ((experienceHours(workExperience) * 160
                * rate)) + bonusSalesQuantity(salesQuantity) + bonusSalesSum(salesSum));
    }

    public double getSalary() {
        return salary;
    }

    private double salaryHours(int hours, double rate) {
        if (hours <= 160) {
            return rate * 160;
        } else {
            return rate * 160 + (hours - 160) * (rate * 1.5);
        }
    }

    private double experienceHours(int workExperience) {
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

    private double bonusSalesQuantity(int salesQuantity) {
        if (salesQuantity < 10) {
            return -150;
        } else if (salesQuantity > 20) {
            return 250;
        } else return 0;
    }

    private double bonusSalesSum(double salesSum) {
        if (salesSum > 15000) {
            return 250;
        } else return 0;
    }
}
/*1 - Расчёт зарплаты агента по продажам
Расчёт зарплаты нужно разбить на несколько методов:
1. Первый метод получает количество отработанных часов и базовую ставку.
если количество отработанных часов больше 160 то каждый
последующий час по коэф 1,5 (параметры у метода - входящие часы
int, и double rate) , возвращаемое значение - зарплата. Это должна
быть сумма базовой зарплаты (до 160 часов) + бонус за переработку
свыше 160 часов (если переработка была) (double)
2. Второй метод - получает коэффициент на базовые часы (которые до 160) в
зависимости от стажа работы (параметры у метода - стаж работы int,
возвращаемое значение double коэффициент)
до 2 лет 1
от 2 до 4 - 1.2
от 4 до 6 - 1.3
от 6 лет - 1.4
3. В зависимости от количества продаж - больше 20 - бонус 250, меньше 10
штраф 150 (параметры у метода - количество продаж int, возвращаемое
значение double бонус за количество продаж)
4. четвертый в зависимости от суммы продаж больше 15000 $ - тоже добавляется
бонус (параметры у метода - сумма продаж double, возвращаемое значение
double бонус за сумму продаж)
Пункты 2, 3 и 4 появляются только при прохождении испытательного срока
Создать класс SalesAgentSalary - у него будет 2 параметризированных конструктора -
первый принимает в себя параметры - входящие часы int, double - рейт в час;
второй принимает в себя параметры - входящие часы int, double - рейт в час, int - стаж
работы, int - количество продаж, double - Сумма продаж
Все методы расчета (можно взять с прошлого урока)
Метод getSalary - который будет возвращать double
В конструкторах вызывать метод setSalary - который будет сэтить сэлэри в
зависимости от конструктора (и от того прошел ли испытательный срок
соответственно)
Понимание прошел ли сотрудник испытательный срок реализовать с помощью
конструктора (если 2 параметра, то еще на ИС, если 5 параметров, то уже прошел)
Создать класс SalaryCalculation.
В нем создать метод main, в методе main 2 ссылки на объект SalesAgentSalary c
разными конструкторами вывести в консоль результат*/

