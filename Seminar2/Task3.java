package Seminar2;
// Задание 3.
// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
// Не использовать метод reverse().

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String result = deleteSpaces(text);
        System.out.println(result);
        System.out.println(isPalindrome(result) ? "Палиндром" : "Не палиндром");
        reader.close();
    }
    private static String deleteSpaces(String text) {
        return text.replaceAll("\s", "");
    }
    private static boolean isPalindrome(String text) {
        return new StringBuffer(text).reverse().toString().toLowerCase().equals(text.toLowerCase());
    }
}
