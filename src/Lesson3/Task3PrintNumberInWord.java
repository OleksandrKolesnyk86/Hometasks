package Lesson3;

public class Task3PrintNumberInWord {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("ONE");
                num++;
            case 2:
                System.out.println("TWO");
                num++;
            case 3:
                System.out.println("THREE");
                num++;
            case 4:
                System.out.println("Four");
                num++;
            case 5:
                System.out.println("FIVE");
                num++;
            case 6:
                System.out.println("SIX");
                num++;
            case 7:
                System.out.println("SEVEN");
                num++;
            case 8:
                System.out.println("Eight");
                num++;
            case 9:
                System.out.println("NINE");
                num++;
            default:
                System.out.println("OTHER");
        }
    }
}
/* Another way
public class Task3PrintNumberInWord {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите число от 1 до 9");
        int num = a.nextInt();
        if (num == 1) {
            System.out.println("ONE");
        } else if (num == 2) {
            System.out.println("TWO");
        } else if (num == 3) {
            System.out.println("THREE");
        } else if (num == 4) {
            System.out.println("Four");
        } else if (num == 5) {
            System.out.println("FIVE");
        } else if (num == 6) {
            System.out.println("SIX");
        } else if (num == 7) {
            System.out.println("SEVEN");
        } else if (num == 8) {
            System.out.println("Eight");
        } else if (num == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }
    }
}
*/
