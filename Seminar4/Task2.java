package Seminar4;
// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> linkStr = new LinkedList<>();
        Scanner scn = new Scanner(System.in);
        while (true) {
            String str = scn.nextLine();
            if (!str.equalsIgnoreCase("print") &&
                    !str.equalsIgnoreCase("revert")) {
                linkStr.push(str);
            } else if (str.equalsIgnoreCase("revert")) {
                linkStr.pop();
            } else {
                Iterator<String> inter = linkStr.iterator();
                while (inter.hasNext()) {
                    System.out.println(inter.next());
                }
            }
        }
    }
}
