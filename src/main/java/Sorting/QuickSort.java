package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int partition(int[] arr, int start, int end, int pivotIdx) {
        int pivotElement = arr[pivotIdx];
        swap(arr, pivotIdx, end);
        int m = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < pivotElement) {
                swap(arr, i, m);
                m++;
            }
        }
        swap(arr, m, end);
        return m;
    }

    public static int getRandom(int l, int r) {
        return (int) ((Math.random() * (r - l)) + l);
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        int pivotIdx = getRandom(start, end);
        int x = partition(arr, start, end, pivotIdx);
        quickSort(arr, start, x - 1);
        quickSort(arr, x + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 8, 9, 1, 0, 12, 68, -10, 1 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}