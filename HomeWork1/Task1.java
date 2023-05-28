// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HomeWork1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); // считывание с консоли
        System.out.println("Введите n (n > 0)");
        int n = iScanner.nextInt(); // считанныое число с консоли поместили в переменную
        iScanner.close(); // закрыли считывание!!!

        if (n <= 0) {
            System.out.println("Неверный ввод n! (n > 0)"); // проверка на ввод отрицательное число
            return;
        }

        System.out.println("n-ое треугольное число (суммы чисел): " + n * (n + 1) / 2);
        System.out.println("n-ое треугольное число (факториал): " + getFactorial(n));

    }

    public static int getFactorial(int n) { // метод расчета факториала с использованием рекурсии
        if (n <= 1) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }
}