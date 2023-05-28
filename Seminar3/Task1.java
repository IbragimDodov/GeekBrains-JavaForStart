// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(getRandNumb());
        }

        System.out.println(list);
        list.sort(null);
        System.out.println(list);

    }

    static int getRandNumb() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
