package Lesson8;

public class Task3SmartphoneTester {
    public static void main(String[] args) {
        IOSSmartphone a = new IOSSmartphone("IOS 6, ", "USB TYPE C, ", "App Store");
        AndroidSmartphone b = new AndroidSmartphone("Android 11, ", "USB, ", "Play market");
        a.phoneCell();
        System.out.println(a.getOperationSystem() + a.getChargerType() + a.getApplicationStore());
        b.phoneCell();
        System.out.println(b.getOperationSystem() + b.getChargerType() + b.getApplicationStore());
    }
}

abstract class Phone {
    String ops;
    String chargerType;
    String applicationStore;

    public void phoneCell() {
        System.out.println("Выполняется набор номера");
    }

    abstract void setChargerType(String chargerType);

    abstract void setOperationSystem(String ops);

    abstract void setApplicationStore(String applicationStore);

    abstract String getChargerType();

    abstract String getOperationSystem();

    abstract String getApplicationStore();
}


class IOSSmartphone extends Phone {
    private String ops;
    private String chargerType;
    private String applicationStore;

    IOSSmartphone(String ops, String chargerType, String applicationStore) {
        this.ops = ops;
        this.chargerType = chargerType;
        this.applicationStore = applicationStore;
        setOperationSystem(this.ops);
        setChargerType(this.chargerType);
        setApplicationStore(this.applicationStore);
        //super.phoneCell();
    }

    public String getChargerType() {
        return chargerType;
    }

    public String getOperationSystem() {
        return ops;
    }

    public String getApplicationStore() {
        return applicationStore;
    }

    void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }


    void setOperationSystem(String ops) {
        this.ops = ops;
    }

    void setApplicationStore(String applicationStore) {
        this.applicationStore = applicationStore;
    }
}

class AndroidSmartphone extends Phone {
    private String ops;
    private String chargerType;
    private String applicationStore;

    AndroidSmartphone(String ops, String chargerType, String applicationStore) {
        this.ops = ops;
        this.chargerType = chargerType;
        this.applicationStore = applicationStore;
        setOperationSystem(this.ops);
        setChargerType(this.chargerType);
        setApplicationStore(this.applicationStore);
        //super.phoneCell();
    }

    public String getChargerType() {
        return chargerType;
    }

    public String getOperationSystem() {
        return ops;
    }

    public String getApplicationStore() {
        return applicationStore;
    }

    void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }


    void setOperationSystem(String ops) {
        this.ops = ops;
    }

    void setApplicationStore(String applicationStore) {
        this.applicationStore = applicationStore;
    }
}

/*3.Создать абстрактный класс телефон (у него метод
набор номера с реализацией (просто выводит в консоль что выполняется набор
телефона), а методы
- Операционная Система (setChargerType()), - абстрактный
- Интерфейс Зарядки (setOperationSystem())и абстрактный
- Магазин Приложений (setApplicationStore()) ---- абстрактный)
у класса Phone будет 2 наследника - iOSSmartphone and
AndroidSmartphone - они реализуют абстрактные методы суперкласса (можно
явно передать значения) реализованные методы сетят поля класса
В классе SmartphoneTester создать ссылки на объекты телефонов и вывести в консоль
техническую информацию об устройстве с помощью геттеров.
Для примера у IOSSmartphone есть приватное поле String os, в методе
setOperationSystem() сетится его значение, потом этот метод вызываем а
конструкторе после этого в классе SmartphoneTester создаем ссылку и
вызываем getOperationSystem() После этого выводим в консоль*/