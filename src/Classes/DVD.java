package Classes;

import Interfaces.ILibraryItem;

//3) Создайте класс DVD, который реализует интерфейс LibraryItem.
// В классе DVD переопределите метод getDescription(), чтобы он возвращал строку вида "DVD: [название DVD]".
//9) Создайте объекты Book и DVD, заполните их данными (название и автор для книги, название для DVD), и добавьте их в объект Library.
public class DVD implements ILibraryItem {
    @Override
    public void getDescription() {
        System.out.println("DVD: [Сказки Пушкина]");

    }
}
