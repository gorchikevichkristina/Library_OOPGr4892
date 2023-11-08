package Classes;
//1) Создайте класс Book с полями title (название книги) и author (автор книги). Этот класс представляет книгу в библиотеке.

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
    }

    @Override
    public void Description() {

    }
}
