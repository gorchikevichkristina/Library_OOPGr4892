package Classes;

import Interfaces.ILibraryItem;

import java.util.List;

//6) Создайте класс Classes.Library, который будет представлять библиотеку.
// Этот класс должен содержать список элементов LibraryItem.
public class Library {
    private List<ILibraryItem> libraryItemList;

    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("Как почесать котику пузико", "Клочков А.И.");
        DVD dvd = new DVD("В мире котиков");

        library.addItem(book);
        library.addItem(dvd);

        library.listItems();

        int compareResult = library.getLibraryItemList().get(0).compareTo(library.getLibraryItemList().get(1));

        if (compareResult > 0) {
            System.out.println("Первый объект в списке больше второго");
        } else if (compareResult < 0) {
            System.out.println("Первый объект в списке меньше второго");
        } else {
            System.out.println("Объекты в списке равны");
        }
    }
    // Метод для добавления контакта и номера в телефонную книгу
    public void addItem(ILibraryItem item) {
        libraryItemList.add(item);
    }

    public void listItems() {
        for (ILibraryItem item : libraryItemList) {
            System.out.println(item.getDescription());
        }
    }

    public List<ILibraryItem> getLibraryItemList() {
        return libraryItemList;
    }

    public void setLibraryItemList(List<ILibraryItem> libraryItemList) {
        this.libraryItemList = libraryItemList;
    }
}
