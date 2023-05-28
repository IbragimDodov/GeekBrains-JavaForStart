package HomeWork3;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

// Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Task3 {

    public static void main(String[] args){
        ArrayList<Integer> arr =  GetRandomArray(10);
        System.out.println(arr);
        Results(arr);
    }

    public static ArrayList<Integer> GetRandomArray(int n) {
        ArrayList<Integer> newArray = new ArrayList<>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            newArray.add(random.nextInt(0,11));
        }
        return newArray;
    }
    
    public static void Results(ArrayList<Integer> arr) {
        arr.sort(Comparator.naturalOrder());
        System.out.println("Минимальное: " + arr.get(0));
        System.out.println("Максимальное: " + arr.get(arr.size()-1));
        double sumVal = 0;
        double arithmeticMean = 0;
        for (int i = 0; i < arr.size(); i++) {
            sumVal += arr.get(i);
        }
        arithmeticMean = sumVal / arr.size();
            String s = Double.toString(arithmeticMean);
            DecimalFormat decimalFormat = new DecimalFormat("0.#####");
            String res = decimalFormat.format(Double.valueOf(s));
        System.out.println("Среднее: " + res);
    }
}
