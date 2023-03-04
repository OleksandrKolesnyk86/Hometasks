package Lesson9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2GradeBook {
    public static void main(String[] args) {
        Set<String> namesOfStudents = TestResult.listOfStudentsNames();
        HashMap<String, Integer> firstTest = TestResult.getOriginalGrades();
        HashMap<String, Integer> secondTest = TestResult.getMakeUpGrades();
        HashMap<String, Integer> gradeBookMap = new HashMap<>();
        for (String s : namesOfStudents) {
            if (firstTest.get(s) >= secondTest.get(s)) {
                int a = firstTest.get(s);
                gradeBookMap.put(s, a);
            } else {
                int b = secondTest.get(s);
                gradeBookMap.put(s, b);
            }
        }
        for (Map.Entry<String, Integer> f : gradeBookMap.entrySet()) {
            System.out.println(f);
        }
    }
}
/*2. Для продвинутого уровня на 25 баллов
У нас есть класс - TestResults (в прикрепленном файле есть java file) - это Map (ключ
значение)
там есть две мапы
getOriginalGrades - оценка в первую сдачу
getMakeUpGrades - оценка во время пересдачи
Преподаватель будет ставить бОльшую оценку
Например, по первому тесту я получил 24 балла, по второму - 97. Моя итоговая будет
97.
Но Лиззи на получила 80 баллов за 1-й тест и 76 баллов за 2-й. Значит, ее итоговая
будет 80.
Создать класс GradeBook, в нем создать некст
Set<String> namesOfStudents = TestResult.listOfStudentsNames();
HashMap<String, Integer> firstTest = TestResult.getOriginalGrades();
HashMap<String, Integer> secondTest = TestResult.getMakeUpGrades();
HashMap<String, Integer> gradeBookMap = new HashMap<>();
Потом сделать loop по namesOfStudents, внутри тела цикла вызывать по ключу
элементы из firstTest и secondTest, сравнивать их и большее значение ложить в
gradeBookMap
После всех итераций вывести в консоль итоговые оценки*/