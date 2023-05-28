package Seminar5;
// Написать метод, который переведет число из римского формата записи в арабский. 
// Например, MMXXII = 2022

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите римскую цифру ");
        String s = iScanner.nextLine();

        int end = s.length() - 1;
        char[] array = s.toCharArray();
        int arabian;
        int result = map.get(array[end]);
        for (int i = end - 1; i >= 0; i--) {
            arabian = map.get(array[i]);

            if (arabian < map.get(array[i + 1])) {
                result -= arabian;
            } else {
                result += arabian;
            }
        }
        System.out.println(result);
    }
}
