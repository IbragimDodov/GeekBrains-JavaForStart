package HomeWork1;
// 3. Реализовать простой калькулятор
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); // считывание с консоли
        System.out.print("Введите первое число: ");
        int firstNumber = iScanner.nextInt(); // помещаем в переменную считанное с консоли
        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = iScanner.next().charAt(0); // вводим тип данных который хранит по одном символу в строке
        System.out.print("Введите второе число: ");
        int secondNumber = iScanner.nextInt();
        iScanner.close();
        if (operation == '/' && secondNumber == 0) System.out.println("Ошибка, на 0 делить нельзя");
        else if (operation == '+') System.out.printf("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
        else if (operation == '-') System.out.printf("%d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber);
        else if (operation == '*') System.out.printf("%d * %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
        else if (operation == '/') System.out.printf("%d / %d = %d", firstNumber, secondNumber, firstNumber / secondNumber);
    }
}
