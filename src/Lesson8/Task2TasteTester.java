package Lesson8;

public class Task2TasteTester {
    public static void main(String[] args) {
        BirthdayCake a = new BirthdayCake(10, "Сливочный торт", 120.5);
        System.out.println(a.getTaste() + ", " + a.getCandles() + " свечей, " + "цена " + a.getPrice());
        WeddingCake b = new WeddingCake(5, "Йогуртовый торт", 200.8);
        System.out.println(b.getTaste() + ", " + b.getTiers() + " ярусов, " + "цена " + b.getPrice());
    }
}

class Cake {
    String taste;
    Double price;

    void setTaste(String taste) {
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
}

class BirthdayCake extends Cake {
    int candles;
    String taste;
    Double price;

    BirthdayCake(int candles, String taste, Double price) {
        this.candles = candles;
        this.taste = taste;
        this.price = price;
        setTaste(this.taste);
        setPrice(this.price);
        setCandles(this.candles);
    }

    void setCandles(int candles) {
        this.candles = candles;
    }

    int getCandles() {
        return candles;
    }
}

class WeddingCake extends Cake {
    int tiers;
    String taste;
    Double price;

    WeddingCake(int tiers, String taste, Double price) {
        this.tiers = tiers;
        this.taste = taste;
        this.price = price;
        setTaste(this.taste);
        setPrice(this.price);
        setTiers(this.tiers);
    }

    void setTiers(int tiers) {
        this.tiers = tiers;
    }

    int getTiers() {
        return tiers;
    }
}

/*2. Cуперкласс (тоже НЕабстрактный) Cake и у него два поля, вкус и цена.
Сделать getterы и setterы для этих полей.
Класс BirthdayCake, который наследует Cake и у него есть собственное поле “свечи”
- int.
Класс под названием WeddingCake, который также наследует Cake и имеет поле
“ярусы” - int
Для ярусов и свечей тоже сделать getterы и setterы.
Класс TasteTester, в котором создать ссылки на объекты и вывести в консоль*/