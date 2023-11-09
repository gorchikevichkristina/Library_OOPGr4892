package Classes;

import Interfaces.ILibraryItem;

//3) Создайте класс DVD, который реализует интерфейс LibraryItem.
// В классе DVD переопределите метод getDescription(), чтобы он возвращал строку вида "DVD: [название DVD]".
//9) Создайте объекты Book и DVD, заполните их данными (название и автор для книги, название для DVD), и добавьте их в объект Classes.Library.
public class DVD implements ILibraryItem {
    private String title;

    public DVD(String title) {
        this.title = title;
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
    public String getDescription() {
        return "DVD " + title;
    }
}
