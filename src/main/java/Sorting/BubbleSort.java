package Sorting;

import java.util.Arrays;

public class BubbleSort{
    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(bubbleUp(arr, i)){
                return;
            }
            System.out.println(i + ":" +Arrays.toString(arr));
        }
    }

    private static boolean bubbleUp(int[] arr, int passNumber) {
        boolean isSorted = true;
        for(int j = 0; j < arr.length - passNumber - 1; j++){
            if(arr[j] > arr[j+1]){
                swap(arr, j, j + 1);
                isSorted = false;
            }
        }
        return isSorted;
    }

    public static void main(String[] args){
        int[] arr = {25,24,23,22,21,20};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}