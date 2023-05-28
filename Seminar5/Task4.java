package Seminar5;
// Написать метод, который переведёт данное целое число в римский формат.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            System.out.println(number + " -> " + intToRoman(number));
        }
    }

    public static String intToRoman(int arabNumber) {
        String[] keys = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder romanNumber = new StringBuilder();
        int index = 0;
        while (index < keys.length) {
            while (arabNumber >= values[index]) {
                int temp = arabNumber / values[index];
                arabNumber = arabNumber % values[index];
                romanNumber.append(keys[index].repeat(temp));
            }
            index++;
        }
        return romanNumber.toString();
    }
}
