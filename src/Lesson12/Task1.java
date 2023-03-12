package Lesson12;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Computer> computerList = ComputerCollection.computersList();
        List<Computer> windowsComputers = computerList.stream().filter
                (computer -> computer.getOS().equals("Windows")).collect(Collectors.toList());
        System.out.print(windowsComputers);
    }
}
/*1. Из коллекции компьютеров computersList() создать новую коллекцию с только
“Windows”
*/