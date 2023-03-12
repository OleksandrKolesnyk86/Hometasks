package Lesson12;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Computer> computerList = ComputerCollection.computersList();
        List<Double> prices = computerList.stream().map(Computer::getPrice).collect(Collectors.toList());
        System.out.print(prices);
    }
}
/*3. Из коллекции компьютеров computersList() вернуть коллекцию цен*/