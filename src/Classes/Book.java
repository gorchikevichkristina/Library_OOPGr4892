package Classes;
//1) Создайте класс Book с полями title (название книги) и author (автор книги). Этот класс представляет книгу в библиотеке.
//9) Создайте объекты Book и DVD, заполните их данными (название и автор для книги, название для DVD), и добавьте их в объект Classes.Library.

import Interfaces.ILibraryItem;

import java.util.Objects;

public class Book implements ILibraryItem {
    private String title;
    private String author;

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
    public String getDescription() {
        return "Book " + title + ", " + author;
    }

    @Override
    public int compareTo(ILibraryItem item) {
        //Сравниваем итемы по длине описания, -1 - входной объект больше, 1 - входной объект меньше, 0 - объекты равны
        if (item.getDescription().length() > this.getDescription().length()) {
            return -1;
        } else if (item.getDescription().length() < this.getDescription().length()) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

