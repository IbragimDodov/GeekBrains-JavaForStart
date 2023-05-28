// Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Task2_2 {
    public static void main(String[] args) {
        int count = 0;
        ArrayList<String> planet = new ArrayList<>(7);
        planet.add("Земля");
        planet.add("Венера");
        planet.add("Меркурий");
        planet.add("Марс");
        planet.add("Сатурн");
        planet.add("Земля");
        planet.add("Сатурн");
        Iterator<String> iterator = planet.iterator();
        while (iterator.hasNext()) {
            if (Collections.frequency(planet, iterator.next()) > 1) {
                count++;
                iterator.remove();
            }
        }
        System.out.println(planet);
        System.out.println(count);
    }

}
