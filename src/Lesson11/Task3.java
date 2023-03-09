package Lesson11;

public class Task3 {
    public static void main(String[] args) {
        String name = "Petia";
        System.out.println(repeatRepeatRepeat(name));
    }

    public static String repeatRepeatRepeat(String inputString) {
        String a = inputString.substring(0, 3);
        if (inputString.length() > 3) {
            return a.repeat(3);
        } else {
            return inputString;
        }
    }
}
/*Если длина строки меньше или равно 3, то она остается без изменений. Если
больше 3, то нужно вернуть новую строку, которая составляет 3 копии первых
трех символов
public String repeatRepeatRepeat(String inputString ) { }
"Java" → "JavJavJav"
"Chocolate" → "ChoChoCho"
"abc" → "abс*/