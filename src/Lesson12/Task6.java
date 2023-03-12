package Lesson12;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Computer> computerList = ComputerCollection.computersList();
        boolean dosIsPresent = computerList.stream().noneMatch(computer -> computer.getOS().equals("DOS"));
        System.out.println(dosIsPresent);
    }
}
/*6. Написать boolean - который проверяет что в коллекции нет компьютера с ОС
“DOS” (noneMatch)*/