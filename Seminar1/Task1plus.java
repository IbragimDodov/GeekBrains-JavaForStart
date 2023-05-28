package Seminar1;

// Задание №1+
// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.util.Scanner;
import java.time.LocalTime;

public class Task1plus {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); // запускаем считывание с консоли
        System.out.printf("Введите Ваше имя: ");
        String Name = iScanner.next(); //считанное с консоли кладем в строковую переменную
        String a; //вводим дополнительную переменную
        int Hour = LocalTime.now().getHour(); // переменная с привязкой реального времени
        if (Hour == 23 || Hour < 5)
            a = "Доброй ночи";
        else if (Hour < 12)
            a = "Доброе утро";
        else if (Hour < 18)
            a = "Добрый день";
        else
            a = "Добрый вечер";
        System.out.println(a + ", " + Name + "!"); // вывод результата
        iScanner.close(); // закрываем считывание с консоли!!!
    }

}
