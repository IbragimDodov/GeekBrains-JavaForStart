package HomeWork1;
// 2. Вывести все простые числа от 1 до 1000 (делятся на себя и на 1)
public class Task2 {
    public static void main(String[] args) {
        System.out.print("Простые числа от 1 до 1000: ");
        for (int i = 2; i <= 1000; i++) { //цикл перебора чисел
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) { //условие деления числа самого на себя
                    if (i == j) { 
                        System.out.print(i + " "); // запись простого числа
                    }
                    else {
                        break;
                    }
                }
            }
        }
    }    
}
