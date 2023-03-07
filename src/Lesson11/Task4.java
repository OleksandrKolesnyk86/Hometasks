package Lesson11;

public class Task4 {
    public static void main(String[] args) {
        String pet = "cat";
        System.out.println(backAround(pet));
    }

    public static String backAround(String str) {
        String a = str.substring(str.length() - 1);
        return a + str + a;
    }
}
/*4. Взять последний символ в строке и вернуть новую строку с последним
символом, добавленным спереди и сзади, «cat» -> «tcatt».
public String backAround(String str) {}
"cat" → "tcatt"
"Hello" → "oHelloo"
"a" → "aaa"*/