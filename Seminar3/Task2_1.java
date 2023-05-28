// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.
import java.util.ArrayList;
import java.util.Comparator;

public class Task2_1 {
    public static void main(String[] args) {
        ArrayList<String> planet = new ArrayList<>(7);
        planet.add("Земля");
        planet.add("Венера");
        planet.add("Меркурий");
        planet.add("Марс");
        planet.add("Сатурн");
        planet.add("Земля");
        planet.add("Сатурн");
        System.out.println(planet);
        planet.sort(Comparator.naturalOrder());
        String temp = planet.get(0);
        int count = 1;
        for (int i = 1; i < planet.size(); i++) {
            if (planet.get(i) == temp) {
                count++;
            } else {
                System.out.printf(count + " " + temp + " ");
                temp = planet.get(i);
                count = 1;
            }
        }
        System.out.printf(count + " " + temp + " ");
    }
}
