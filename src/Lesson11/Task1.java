package Lesson11;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String words = "Get a modern feel with a smudge-resistant " +
                "only for $2.50, you can finish now";
        System.out.println(afterFellInUpperCase(words));
    }

    public static String afterFellInUpperCase(String inputString) {
        String[] a = inputString.split(" ");
        String searchWord = "feel";
        int index = Arrays.asList(a).indexOf(searchWord);
        String ourWord = a[index + 1];
        return ourWord.toUpperCase();
    }
}



/*1. Написать метод который принимает в себя строку с несколькими словами и
возвращает строку с одним словом, которое идет за текущим в upper case
(например мы ищем строке “Get a modern feel with a smudge-resistant only for
$2.50, you can finish now” слово которой идет после слова “feel” (т.е. должен
вернуть “WITH” )
public String afterFellInUpperCase(String inputString) {} */