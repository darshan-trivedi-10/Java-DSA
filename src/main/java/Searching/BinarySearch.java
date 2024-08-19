package Searching;

import java.util.Arrays;
import java.util.Scanner;

/*
* To apply binary search Arrays | f(x) should be a monotonic function.
*
* The monotonicity of a function tells if a function is increasing or decreasing
*
* Monotonic function is increasing or decreasing on its entire domain.
*
* */
public class BinarySearch {
    public static boolean search(int[] arr, int element) {
        int left = 0, right = arr.length - 1;
        boolean isElementPresent = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == element) {
                isElementPresent = true;
                break;
            }
            if (arr[mid] > element) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return isElementPresent;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]arr = {-5,-2,0,2,4,6,78,100,123};
        int element = input.nextInt();
        System.out.println(search(arr, element));
        System.out.println(Arrays.binarySearch(arr, element));

    }
}
