package Lesson8;

public class Task1JuiceMarket {
    public static void main(String[] args) {
        Apple a = new Apple(50);
        System.out.println(a.getCalories() + " калорий");
        Banana b = new Banana(100);
        System.out.println(b.getCalories() + " калорий");
        Orange c = new Orange(150);
        System.out.println(c.getCalories() + " калорий");
    }
}

class Fruit {
    int calories;

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void makeJuice() {
        System.out.println("Сок сделан");
    }
}

class Apple extends Fruit {
    Apple(int calories) {
        this.calories = calories;
        removeSeeds();
        setCalories(calories);
        makeJuice();

    }

    public void removeSeeds() {
        System.out.println("Происходит очистка яблока от косточек");
    }

    @Override
    public void makeJuice() {
        //super.makeJuice();
        System.out.println("Яблочный сок сделан");
    }
}

class Banana extends Fruit {
    Banana(int calories) {
        this.calories = calories;
        peeling();
        setCalories(calories);
        makeJuice();

    }

    public void peeling() {
        System.out.println("Происходит очистка кожуры банана");
    }

    @Override
    public void makeJuice() {
        System.out.println("Банановый сок сделан");
    }
}

class Orange extends Fruit {
    Orange(int calories) {
        this.calories = calories;
        peeling();
        setCalories(calories);
        makeJuice();

    }

    public void peeling() {
        System.out.println("Происходит очистка кожуры апельсина");
    }

    @Override
    public void makeJuice() {
        System.out.println("Апельсиновый сок сделан");
    }
}



/*1. Создайте класс Fruit. (уточняю - НЕабстрактный)))
В этом классе добавьте поле int “сalories” для него setCalories() и getCalories а также
метод makeJuice(), который печатает в консоль - "сок сделан" (общее сообщение).
Затем создайте несколько подклассов - Apple, Banana, Orange, Lemon (они
естественно наследуют Fruit)
Потом добавьте методы в дочерних классах, которые специфичны только для данных
фруктов. По типу если вы собираетесь делать яблочный сок Apple, то сделайте
удаление косточек removeSeeds(). Если вы собираетесь делать банановый класс, то
очистка peel() и т д (эти методы просто выводят в консоль инфо типо “сейчас
происходит очистка банана”)
А затем вызовите setCalories() (метод суперкласса) в конструкторах этих подклассов и
поставьте калорийность
Переопределите метод makeJuice() для вывода в консоль конкретного типа
сока, который изготавливается.
После создать класс JuiceMarket, в котором создадите несколько вариаций этих
объектов и вывод в консоль*/