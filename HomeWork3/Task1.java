package HomeWork3;

// Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] array = {2, 4, 7, 0, 1, 6, 5, 9};
        int[] result = sort(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sort(int[] arr) {
        int[] array1 = Arrays.copyOf(arr, arr.length);
        int[] array2 = new int[arr.length];
        int[] result = mergesort(array1, array2, 0, arr.length);
        return result;
    }

    public static int[] mergesort(int[] newArr1, int[] newArr2, int firstInd, int secondInd) {
        if (firstInd >= secondInd - 1) {
            return newArr1;
        }
        int middle = firstInd + (secondInd - firstInd) / 2;
        int[] arr1 = mergesort(newArr1, newArr2, firstInd, middle);
        int[] arr2 = mergesort(newArr1, newArr2, middle, secondInd);
        int ind1 = firstInd;
        int ind2 = middle;
        int new_index = firstInd;
        int[] result = arr1 == newArr1 ? newArr2 : newArr1;
        while (ind1 < middle && ind2 < secondInd) {
            if (arr1[ind1] < arr2[ind2]) {
                result[new_index++] = arr1[ind1++];
            }
            else result[new_index++] = arr2[ind2++];
        }
        while (ind1 < middle) {
            result[new_index++] = arr1[ind1++];
        }
        while (ind2 < secondInd) {
            result[new_index++] = arr2[ind2++];
        }
        return result;
    }
}
