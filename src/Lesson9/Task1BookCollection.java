package Lesson9;

import java.util.ArrayList;

public class Task1BookCollection {
    public static void main(String[] args) {
        ArrayList<Book> bookCollection = new ArrayList<>();
        bookCollection.add(new Book(10, "Book1", "hard", 100));
        bookCollection.add(new Book(1570, "Book2", "soft", 1050));
        bookCollection.add(new Book(110, "Book3", "soft", 1230));
        bookCollection.add(new Book(1200, "Book4", "hard", 1070));
        bookCollection.add(new Book(1220, "Book5", "soft", 1040));
        bookCollection.add(new Book(1330, "Book6", "hard", 1030));
        bookCollection.add(new Book(1440, "Book7", "hard", 1010));
        bookCollection.add(new Book(1550, "Book8", "soft", 1090));
        bookCollection.add(new Book(1560, "Book9", "hard", 1080));
        bookCollection.add(new Book(1110, "Book10", "hard", 1990));
        ArrayList<Book> booksWithSoftCover = new ArrayList<>();
        ArrayList<Book> booksWithHardCover = new ArrayList<>();
        for (Book i : bookCollection) {
            if (i.getCoverType().equals("soft")) {
                booksWithSoftCover.add(i);
            } else {
                booksWithHardCover.add(i);
            }
        }
        System.out.println("В магазине есть следующие книги:");
        for (Book i : bookCollection) {
            System.out.println(i.getTitle());
        }
        System.out.println("В магазине есть следующие книги с мягким переплетом:");
        for (Book i : booksWithSoftCover) {
            System.out.println(i.getTitle());
        }
        System.out.println("В магазине есть следующие книги с твердым переплетом:");
        for (Book i : booksWithHardCover) {
            System.out.println(i.getTitle());
        }
    }
}


/*1.
Первая задача - на 75 баллов
Создать POJO класс Book
у класса Book - 4 параметра (поля класса),
double price
String title
String coverType (может быть только hard или soft)
int quantityOfPages
у них у всех есть геттеры и сеттеры и эти поля инициализируются при вызове конструктора
(т е в классе Book есть конструктор с 4 параметрами)
Создать класс BookTester - в нем psvm
В psvm проинициализировать ArrayList (назовем его bookCollection) который может
содержать только Book
Наполнить коллекцию 10 книгами по слабой ссылке (т е через new Book(...,...,...,...))
Перед циклом проинициализировать 2 коллекции (типа ArrayList)
booksWithSoftCover
booksWithHardCover
Сделать перебор по коллекции (цикл) bookCollection в котором с помощью оператора if
наполнить коллекции booksWithSoftCover и booksWithHardCover, т е вызвать getCoverType у
каждого элемента коллекции и если он .equals(“soft”) - то мы добавляем в
booksWithSoftCover в противном случае в booksWithHardCover
После цикла у нас 3 коллекции -
bookCollection - все книги
booksWithSoftCover - книги только в мягком переплете
booksWithHardCover - книги только в твердом переплете
Далее вывести в консоль с соответствующими логами - все названия книг каждого массива
Что то типа “В магазине есть след книги с мягким переплетом” и далее список title
Сообщение “В магазине есть след книги с мягким переплетом” вызвать перед циклом чтобы
оно не повторялось
Т е мы делаем перебор - и у каждого элемента вызываем getTitle и печатаем в консоль*/