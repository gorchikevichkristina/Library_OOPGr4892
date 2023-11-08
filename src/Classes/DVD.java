package Classes;

import Interfaces.ILibraryItem;

//3) Создайте класс DVD, который реализует интерфейс LibraryItem.
// В классе DVD переопределите метод getDescription(), чтобы он возвращал строку вида "DVD: [название DVD]".
public class DVD implements ILibraryItem {
    @Override
    public void getDescription() {
        System.out.println("DVD: [Сказки Пушкина]");

    }
}
