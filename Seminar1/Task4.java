package Seminar1;
// Задание №4 
// Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".
public class Task4 {
    public static void main(String[] args) {
        String[] arr = new String[] {"коррупция", "коридор", "корица", "коробка", "коробок"}; 
        String prefix = arr[0]; 
        for(String word: arr){ //перебор массива
            while(!word.startsWith(prefix) && prefix.length() > 0) { // проверка начинается ли строка с префикса который должен быть сопоставлен
                prefix = prefix.substring(0, prefix.length() - 1); // возвращение значения после проверки, начальный индекс 0
            }
        }
        System.out.println("Общий префикс: " + prefix);
    }
}