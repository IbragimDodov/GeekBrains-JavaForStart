package Seminar1;
// Задание №1
// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); // считываем с консоли
        System.out.printf("Введите ваше имя: ");
        String name = iScanner.nextLine(); // помещаем считанное в строковую переменную
        System.out.printf("Привет, %s!", name);
        iScanner.close(); // закрываем считывание с консоли!!!
    }
}
