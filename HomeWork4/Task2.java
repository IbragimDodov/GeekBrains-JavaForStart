package HomeWork4;
// Реализуйте очередь с помощью LinkedList со следующими методами:
// - enqueue() - помещает элемент в конец очереди, 
// - dequeue() - возвращает первый элемент из очереди и удаляет его, 
// - first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.logging.Logger;

public class Task2 {
    public static void main(String[] args) {
        Logger log = Logger.getAnonymousLogger();
        LinkedList<Integer> ls = new LinkedList<Integer>();

        for (int i = 0; i < 6; i++) {
            ls.add(i);
        }

        enqueue(ls, 6);
        log.info(ls.toString());

        dequeue(ls, log);
        first(ls,log);
    }

    public static void enqueue(LinkedList list, int value ){
        list.addLast(value);

    }

    public static void dequeue(LinkedList list, Logger log){

        log.info("Первый элемент: "+ list.getFirst());
        list.removeFirst();
        log.info(list.toString());
    }

    public static void first(LinkedList list, Logger log){

        log.info("Первый элемент: "+ list.getFirst());
    }
}
