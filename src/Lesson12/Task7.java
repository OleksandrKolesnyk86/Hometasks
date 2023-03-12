package Lesson12;

import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<Computer> computerList = ComputerCollection.computersList();
        boolean macOsIsPresent = computerList.stream().anyMatch(computer -> computer.getOS().equals("MacOS"));
        System.out.println(macOsIsPresent);
    }
}
/*7. Написать boolean - который проверяет что в коллекции есть компьютер с ОС
“MacOS” (anyMatch)*/