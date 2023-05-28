package HomeWork2;
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[] {98, 1, 17, 20, 3, 11, -10, 2, 1, 0};
        write(array.length, array);
        sort(array);
    }
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            write(i, arr);            
        }
    }
    static void write(int k, int[] ar) {
        try (FileWriter fw = new FileWriter("log.txt", true)) {
            if (k == ar.length) {
                fw.append("Неотсортированный массив - " + Arrays.toString(ar) + "\n");
            } else if (k == ar.length - 2) {
                fw.append(k+1 + " итерация - " + Arrays.toString(ar) + "\n\n");
            } else {
                fw.append(k+1 + " итерация - " + Arrays.toString(ar) + "\n");
            }
            fw.flush();
            fw.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
