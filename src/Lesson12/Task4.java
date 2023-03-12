package Lesson12;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Computer> computerList = ComputerCollection.computersList();
        List<Double> thirdMinPrice = computerList.stream().map(Computer::getPrice).sorted().skip(2).findFirst().stream().toList();
        System.out.println(thirdMinPrice);
    }
}
/*4. Отсортировать по цене и вернуть третий снизу по минимальной цене (используя
skip и findFirst)*/