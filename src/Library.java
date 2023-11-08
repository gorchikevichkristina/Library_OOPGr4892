import Interfaces.ILibraryItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//6) Создайте класс Library, который будет представлять библиотеку.
// Этот класс должен содержать список элементов LibraryItem.
public class Library implements ILibraryItem {
    public static void main(String[] args) {
        Map<String, List<String>> Library = new HashMap<>();

        addItem(Library, "Сказки", "Пушкин А.С.");
        addItem(Library, "Зов Ктулху", "Лавкрафт Г.Ф.");
        addItem(Library, "ОНО", "Кинг С.");

    }
    // Метод для добавления контакта и номера в телефонную книгу
    public static void addItem(Map<String, List<String>> Library, String title, String author) {
        Library.computeIfAbsent(title, k -> new ArrayList<>()).add(author);
    }

    @Override
    public void getDescription() {

    }
}
