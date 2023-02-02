package Lesson3;

import java.util.Scanner;

public class AdvancedTask2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите площадь круга");
        double circleArea = a.nextDouble();
        System.out.println("Введите площадь квадрата");
        double squareArea = a.nextDouble();
        double Pi = 3.1415926536;
        double circleRadius1 = circleArea / Pi;
        double circleRadius = Math.sqrt(circleRadius1);
        System.out.println("Радиус круга = " + circleRadius);
        double sideOfTheSquare = Math.sqrt(squareArea);
        System.out.println("Сторона квадрата = " + sideOfTheSquare);
        double squareDiagonal = sideOfTheSquare * Math.sqrt(2);
        System.out.println("Диагональ квадрата = " + squareDiagonal);
        if ((circleRadius * 2) <= sideOfTheSquare) {
            System.out.println("Круг поместится в квадрате");
        } else {
            System.out.println("Круг не поместится в квадрате");
        }
        if (squareDiagonal <= (2 * circleRadius)) {
            System.out.println("Квадрат поместится в круге");
        } else {
            System.out.println("Квадрат не поместится в круге");
        }
    }
}
/*2.Известны площади круга и квадрата. Определить: уместится ли круг в квадрате
уместится ли квадрат в круге*/