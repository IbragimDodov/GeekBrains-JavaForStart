// Создать список типа ArrayList<String>
// Поместить в него как строчки, так и целые числа
// Пройти по списку, найти и удалить целые числа.
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList<>();
        array.add(1);
        array.add("строка");
        array.add("значение");
        array.add(45);
        System.out.println(array);

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) instanceof Integer) {
                array.remove(i);
                i--;
            }
        }
        System.out.println(array);

    }
}
