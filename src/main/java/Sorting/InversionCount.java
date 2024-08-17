package Sorting;

import java.util.Scanner;

/*
* Problem Link : https://www.spoj.com/problems/INVCNT/
*/
public class InversionCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0){
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = input.nextInt();
            }
            int ans = findTotalInversion(arr, 0, n-1);
            System.out.println(ans);
        }

    }

    private static int findTotalInversion(int[] arr, int start, int end) {
        if (start >= end){
            return 0;
        }
        int mid = (start + end)/2;
        int a = findTotalInversion(arr, start, mid) +
                findTotalInversion(arr, mid + 1, end) + countInversion(arr, start, mid, end);
        return a;
    }

    private static int countInversion(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1, n2 = end-mid, count = 0;
        int []sortedArray = new int[n1 + n2];
        int i = start, j = mid + 1, k = 0;
        // 2 3 3 4 // 1 1
        //
        while (i <= mid && j <= end){
            if(arr[i] > arr[j]){
                sortedArray[k++] = arr[j++];
                count += (mid-i+1);
            }else {
                sortedArray[k++] = arr[i++];
            }
        }

        while (i <= mid){
            sortedArray[k++] = arr[i++];
        }

        while (j <= end){
            sortedArray[k++] = arr[j++];
        }
        System.arraycopy(sortedArray, 0, arr, start, sortedArray.length);
        return count;
    }
}

