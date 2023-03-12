package Lesson12;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<Computer> computerList = ComputerCollection.computersList();
        Map<Integer, Computer> keyComputer = computerList.stream().collect(Collectors
                .toMap(Computer::getId, Function.identity()));
        System.out.println(keyComputer);
    }
}
/*5. Из коллекции компьютеров computersList() вернуть Map<Integer, Computer> где
ключ будет id.
*/