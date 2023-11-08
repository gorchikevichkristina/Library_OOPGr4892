package Classes;
//1) Создайте класс Book с полями title (название книги) и author (автор книги). Этот класс представляет книгу в библиотеке.
//9) Создайте объекты Book и DVD, заполните их данными (название и автор для книги, название для DVD), и добавьте их в объект Library.

import Interfaces.ILibraryItem;

public class Book implements ILibraryItem {
    String title;
    String author;

    //конструктор
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book one = new Book("Сказка", "Пушкин");
        Book two = new Book("Зов Ктулху", "Лавкрафт Г.Ф.");
        Book three = new Book("ОНО", "Кинг С.");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);


    }

    @Override
    public void getDescription() {
        System.out.println("text");
    }
}

