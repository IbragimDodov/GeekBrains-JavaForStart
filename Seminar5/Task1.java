package Seminar5;
// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

import java.util.HashMap;

public class Task1 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(123456, "Иванов");
        map.put(321456, "Васильев");
        map.put(234561, "Петрова");
        map.put(234432, "Иванов");
        map.put(654321, "Петрова");
        map.put(345678, "Иванов");
        System.out.println(map);
        searchItem(map, "Иванов");
    }

    public static void searchItem(HashMap<Integer, String> map, String name) {
        for (var item : map.entrySet()) {
            if (item.getValue().equals(name)) {
                System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
            }
        }
    }
}
