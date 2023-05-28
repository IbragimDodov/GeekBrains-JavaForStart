package Seminar1;

// Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); // считывание с консоли
        System.out.println("Введите число a");
        int a = iScanner.nextInt(); // считанное число с консоли поместили в переменную
        System.out.println("Введите число b");
        int b = iScanner.nextInt();
        iScanner.close(); // закрыли считывание!!!
        if (a == 0 && b == 0) {
            System.out.println("Не определено"); 
        } else {
            System.out.println(Math.pow(a,b));
        }        
    }
}    