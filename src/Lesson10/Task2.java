package Lesson10;

import Lesson9.Book;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Book> newBooks = new ArrayList<>();
        newBooks.add(new Book(10, "Book1", "hard", 100));
        newBooks.add(new Book(1570, "Book2", "soft", 1050));
        newBooks.add(new Book(110, "Book3", "soft", 1230));
        newBooks.add(new Book(1200, "Book4", "hard", 1070));
        newBooks.add(new Book(1220, "Book5", "soft", 1040));
        try {
            Book first = newBooks.get(1);
            System.out.println(first.getTitle());
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("Error, this element does not exist");
        }
        System.out.println();
    }
}
/*В класса main cоздать ArrayList - потом наполнить его 5 элементами Book из
предидущего урока. После этого попытаться достучаться до элемента с
индексом 5. Обработать эксепшен в try - catch*/