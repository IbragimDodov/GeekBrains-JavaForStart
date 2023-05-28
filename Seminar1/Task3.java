package Seminar1;

// Задание №3
// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
public class Task3 {
    public static void main(String[] args) {
        int[] mas = { 3, 2, 2, 3 }; // исходный массив

        System.out.println("Исходный массив:");
        PrintMas(mas);
        ReplaceMas(mas, 3);
        System.out.println("\nПреобразованный массив:");
        PrintMas(mas);
    }

    // метод для перемешивания массива
    public static void ReplaceMas(int[] mas, int value) {
        int i = 0;
        for (int a : mas) {
            if (a == value)
                continue;
            mas[i++] = a;
        }
        for (int j = i; j < mas.length; j++)
            mas[j] = value;
    }

    // метод печати массива
    public static void PrintMas(int[] mas) {
        for (int i : mas)
            System.out.print(i + " ");
    }

}