package Seminar1;
// Задание №5 (доп)
// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
public class Task5 {
    public static void main(String[] args) {
        String words = "Добро пожаловать на курс по Java";
        String[] arrStr = words.split(" "); // превратили фразу в массив по словам
        for (int i = arrStr.length - 1; i >= 0; i--){
        System.out.printf(arrStr[i] + " ");
        }
    }
}
