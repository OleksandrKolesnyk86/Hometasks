package Lesson11;

public class Task5BallTester {
    public static void main(String[] args) {
        System.out.println(Ball.FIRSTBALL);
        System.out.println(Ball.SECONDBALL);
        System.out.println(Ball.THIRDBALL);
        System.out.println(Ball.FOURTHBALL);
        System.out.println(Ball.FIFTHBALL);
    }

    public enum Ball {
        FIRSTBALL(17.6, "football", 20, "leather"),
        SECONDBALL(18.6, "handball", 22, "rubber"),
        THIRDBALL(19.6, "basketball", 24, "leather"),
        FOURTHBALL(20.6, "tennis", 26, "rubber"),
        FIFTHBALL(21.6, "water polo", 28, "leather");
        private double size;
        private String kindOfSport;
        private double price;
        private String material;

        Ball(double size, String kindOfSport, double price, String material) {
            this.size = size;
            this.kindOfSport = kindOfSport;
            this.price = price;
            this.material = material;
        }

        double getSize() {
            return size;
        }

        String getKindOfSport() {
            return kindOfSport;
        }

        double getPrice() {
            return price;
        }

        String getMaterial() {
            return material;
        }

        @Override
        public String toString() {
            return "Size: " + size + "  Kind of sport: " + kindOfSport + " Price: " + price + " Material: " + material;
        }
    }
}

/*5. Написать Enum “Ball” у него будут поля
- размер (double)
- вид спорты (String)
- цена (double)
- материал (String)
 добавить гетеры и конструктор
добавить 5 видов мячей
переопределить toString
 в классе BallTester c помощью toString вывести в консоль инфу о мячах*/