package HomeWork4;
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class Task1 {

    public static void main(String[] args) {
        LinkedList <Integer> linL = new LinkedList<Integer>();
        for(int i = 0; i < 10; i++){
            linL.add(0,i);}
        System.out.println("Обычный список -> " + linL);
        ReversLinkedList(linL);
    }

    public static void ReversLinkedList(LinkedList<Integer> linL) {
        System.out.print("Перевёрнутый список -> [");
        for(int i = linL.size() - 1; i >= 1 ; i--){
            System.out.print(linL.get(i) + ", ");}
            System.out.print(linL.get(0) + "]");
           
    }
}
