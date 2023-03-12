package Lesson12;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Computer> computerList = ComputerCollection.computersList();
        List<Computer> computersWithSSD = computerList.stream().filter(computer -> computer.getStorage()
                .getStorageType().equals("SSD")).limit(2).collect(Collectors.toList());
        System.out.print(computersWithSSD);
    }
}
/*2. Из коллекции компьютеров computersList() вернуть новую коллекцию из 2-х
компютеров с “SSD” жестким диском*/