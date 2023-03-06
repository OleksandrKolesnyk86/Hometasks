package Lesson11;

public class Task2 {
    public static void main(String[] args) {
        String testString = "abc";
        System.out.println(withoutFirstAndLastChar(testString));

    }

    public static String withoutFirstAndLastChar(String inputString) {
        String a;
        if (inputString.length() < 2) {
            return a = "";
        }
        return inputString.substring(1, inputString.length() - 1);
    }
}
/*Для входящей строки вернуть версию без первого и последнего символов
строки. Строка может быть любой длины, включая 0.
public String withoutFirstAndLastChar(String inputString) {}
"Hello" → "ell"
"abc" → "b" */