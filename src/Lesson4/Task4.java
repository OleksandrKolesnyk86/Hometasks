package Lesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите текст");
        String s = scn.nextLine();
        String b = s.replaceAll("\\W", "");
        char[] arrayOfChars = b.toCharArray();
        int c = arrayOfChars.length;
        boolean isPalindrom = false;
        for (int i = 0; i < (c / 2); i++) {
            if (arrayOfChars[i] != arrayOfChars[c - i - 1]) {
                isPalindrom = false;
                break;
            } else {
                isPalindrom = true;
            }
        }
        if (isPalindrom) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}





/*4. Написать программу, которая проверяет является ли строка палиндромом
(используя массив char)
код как получить массив букв из строки
char[] arrayOfChars = "ABC".toCharArray();*/