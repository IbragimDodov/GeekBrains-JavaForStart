// Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        ArrayList<Object> library = new ArrayList<Object>();
        fill_library(library);
        System.out.println(library);

    }

    public static void fill_library(ArrayList<Object> library) {
            
        Scanner in = new Scanner(System.in);
        System.out.print("Введите жанр: ");
        String gen = in.nextLine();

        System.out.print("Введите названия книг: ");
        String nameBook = in.nextLine();

        ArrayList<String> tempLib = new ArrayList<String>();
        tempLib.add(gen);
        String[] arrayBook = nameBook.split(",");

        for (int i = 0; i < arrayBook.length; i++) {
            tempLib.add(arrayBook[i]);
        } 

        library.add(tempLib);
        in.close();
    }
}
