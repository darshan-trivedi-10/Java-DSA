package Sorting;

public class SelectionSort{
    private static void swap(int[]arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static int getMinElementIndex(int[] arr, int i) {
        int minElementIndex = i;
        for(int j = i + 1; j < arr.length; j++){
            if(arr[j] < arr[minElementIndex]){
                minElementIndex = j;
            }
        }
        return minElementIndex;
    }

    private static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minElementIndex = getMinElementIndex(arr, i);
            swap(arr, i, minElementIndex);
        }
    }

    public static void main(String[] args){
        int[]arr = {13,1,4,6,7,9};
        selectionSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}