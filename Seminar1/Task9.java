package Seminar1;
// Задание №9 (доп)
// Записать в файл следующие данные:
// Name Surname Age
// Kate Smith 20
// Paul Green 25
// Mike Black 23 
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Task9 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); // считываем с консоли
        System.out.printf(" Name ");
        String name = iScanner.nextLine(); // помещаем считанное в строковую переменную
        System.out.printf(" Surname ");
        String surname = iScanner.nextLine(); // помещаем считанное в строковую переменную
        System.out.printf(" Age ");
        String age = iScanner.nextLine(); // помещаем считанное в строковую переменную
        iScanner.close(); // закрываем считывание с консоли!!!

        try (FileWriter fw = new FileWriter("text.txt", true)){
            fw.append ("Name Surname Age");
            fw.append ('\n');
            fw.append (name + " ");
            fw.append (surname + " ");
            fw.append (age);
            fw.append ('\n');

            fw.flush();
        }
        catch(IOException ex){
            System.out.println(ex. getMessage());
        }
    }
}
