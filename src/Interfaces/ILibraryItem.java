package Interfaces;

//2) Создайте интерфейс LibraryItem, который будет представлять элемент библиотеки.
// У этого интерфейса должен быть метод getDescription(), который возвращает описание элемента библиотеки.
public interface ILibraryItem extends Comparable<ILibraryItem> { //элемент библиотеки
    String getDescription();//получить описание
}