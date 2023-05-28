package Seminar1;
// Задание №2
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
public class Task2 {
    public static void main(String[] args) {
        int[] mas = { 1, 1, 0, 1, 1, 1}; //исходный массив согласно условиям задачи
        int count = 0;
        int maxcount = 0; // вводим переменную в котрую положим максимальное значение count           
        for (int a : mas) { // в условии цикла вводим перебор массива
            if (a == 1)
                count++;
            else
                count = 0;
            if (count > maxcount)
                maxcount = count;
        }
        
        System.out.printf("максимальное количество подряд идущих 1: %d", maxcount);

    }
}

// for (int i = 0; i < arr.length; i++) {
//     if (arr[i] == 1) {
//         count++;
//         if (max < count){
//             max = count;
//         }
//     } else {
//         count = 0;
//     }
// }
