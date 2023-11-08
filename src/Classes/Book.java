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
    public void getDescription() {
        System.out.println("Сказки Пушкина — уникальные произведения в стихах, " +
                "несмотря на то, что сюжеты для них взяты из народного творчества разных стран. " +
                "Несколько сказок, написанных А. С. Пушкиным, родились как результат дружеского соперничества с В. А. Жуковским. " +
                "Талантливый поэт сумел вложить в каждую из сказок русский колорит, " +
                "глубинный смысл и понимание того, что в каждой сказке есть «добрым молодцам — урок». " +
                "Все сказки А. С. Пушкина напоминают, что важно быть честным, добродетельным и верным слову при любых обстоятельствах.");
    }
}
