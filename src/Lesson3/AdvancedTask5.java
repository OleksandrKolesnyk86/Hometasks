package Lesson3;

import java.util.Scanner;

public class AdvancedTask5 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNum = f.nextInt();
        System.out.println("Введите второе число");
        int secondNum = f.nextInt();
        System.out.println("Введите третье число");
        int thirdNum = f.nextInt();
        if (firstNum > secondNum && firstNum > thirdNum) {
            System.out.println("Первое число самое большое");
        } else if (firstNum < thirdNum && firstNum > secondNum) {
            System.out.println("Первое число является средним");
        } else if (firstNum < secondNum && firstNum > thirdNum) {
            System.out.println("Первое число является средним");
        } else if (firstNum < secondNum && firstNum < thirdNum) {
            System.out.println("Первое число самое маленькое");
        }
        if (firstNum < secondNum && secondNum > thirdNum) {
            System.out.println("Второе число самое большое");
        } else if (firstNum < secondNum && secondNum < thirdNum) {
            System.out.println("Второ число является средним");
        } else if (firstNum > secondNum && secondNum > thirdNum) {
            System.out.println("Второ число является средним");
        } else if (firstNum > secondNum && secondNum < thirdNum) {
            System.out.println("Второ число самое маленькое");
        }
        if (firstNum < thirdNum && secondNum < thirdNum) {
            System.out.println("Третье число самое большое");
        } else if (firstNum < thirdNum && secondNum > thirdNum) {
            System.out.println("Третье число является средним");
        } else if (firstNum > thirdNum && secondNum < thirdNum) {
            System.out.println("Третье число является средним");
        } else if (firstNum > thirdNum && secondNum > thirdNum) {
            System.out.println("Третье число самое маленькое");
        }
        if (firstNum == secondNum && firstNum == thirdNum) {
            System.out.println("Все числа одинаковые");
        }
        if (firstNum == secondNum && firstNum < thirdNum) {
            System.out.println("Первые два числа одинаковые, а третье число самое большое");
        }
        if (firstNum == thirdNum && firstNum < secondNum) {
            System.out.println("Первое и третье число одинаковые");
        }
        if (firstNum > secondNum && secondNum == thirdNum) {
            System.out.println("Второе и третье числа одинаковые");
        }
        if (firstNum > secondNum && firstNum == thirdNum) {
            System.out.println("Первое и третье числа одинаковые");
        }
        if (firstNum == secondNum && firstNum > thirdNum) {
            System.out.println("Первое и второе числа одинаковые");
        }
        if (firstNum < secondNum && secondNum == thirdNum) {
            System.out.println("Второе и третье числа одинаковые");
        }
    }
}
//5.Даны три различных числа. Определить, какое из них (первое, второе или третье) -
//      самое большое - самое маленькое - является средним