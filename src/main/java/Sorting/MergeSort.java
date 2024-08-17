package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1, n2 = end - mid;
        int[] mergeArray = new int[n1 + n2];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end){
            if(arr[i] > arr[j]){
                mergeArray[k++] = arr[j++];
            }else {
                mergeArray[k++] = arr[i++];
            }
        }

        while (i <= mid){
            mergeArray[k++] = arr[i++];
        }

        while (j <= end){
            mergeArray[k++] = arr[j++];
        }

        System.arraycopy(mergeArray,0, arr, start, mergeArray.length);
    }

    public static void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int[] arr = { 11, 36, 1, 2, 9, 7, -10, 25, 0, 18 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
