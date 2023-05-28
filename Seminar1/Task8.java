package Seminar1;
// Задание №8 (доп)
// Задан массив, например, nums = [1,7,3,6,5,6]. 
// Написать программу, которая найдет индекс i для этого массива такой, что сумма элементов с индексами < i равна сумме элементов с индексами > i. 

public class Task8 {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int result = FindIndex(nums);
        if(result<0){
            System.out.println("Такого индекса не существует");
        } else {
            System.out.printf("Индекс равен: %d", result);
        }
    }

   private static int FindIndex(int[] arr) {
    int sumNums = 0;
    int sumArr = 0;
    int result = -1;

    for (int i = 0; i < arr.length; i++) { // Подсчитываем сумму всех элементов массива
        sumArr += arr[i];
    }

    for (int i = 0; i < arr.length; i++) { // поиск индекса i для которого сумма элементов с индексами < i равна сумме элементов с индексами > i
        sumNums += arr[i];
        if (((i + 1) < arr.length) && (sumNums == (sumArr - sumNums - arr[i + 1]))) {
            result = i + 1;
            break;
        }
    }
    return result;
   }
}
