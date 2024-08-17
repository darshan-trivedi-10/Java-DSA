package Sorting;

import java.util.Arrays;

public class InsertionSort{
    public static void insertionSort(int[]arr){
        for(int i = 1; i < arr.length; i++){
            doInsertion(arr, i);
        }
    }

    private static void doInsertion(int[] arr, int i) {
        int j = i - 1;
        int value = arr[i];
        while(j >= 0 && value < arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = value;
    }

    public static void main(String[] args){
        int[]arr = {13,1,4,6,7,9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}