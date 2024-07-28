package Array.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class LongNumberSumUsingArrays {
    public static void main(String[] args) {

        int num1[] = {5,6,2,3,9,0,1,2};
        int num2[] = {9,3,2,4,1,0,0,2};

        ArrayList<Integer> sumOfNum = new ArrayList<>();
        int i = num1.length - 1, j = num2.length - 1, carry = 0;
        while (i >= 0 && j >= 0){
            int sum = num1[i] + num2[j] + carry;
            sumOfNum.add(sum%10);
            carry = sum/10;
            i--;
            j--;
        }

        while (i >= 0){
            int sum = num1[i] + carry;
            sumOfNum.add(sum%10);
            carry = sum/10;
            i--;
        }

        while (j >= 0){
            int sum = num2[j] + carry;
            sumOfNum.add(sum%10);
            carry = sum/10;
            j--;
        }

        while (carry > 0){
            sumOfNum.add(carry%10);
            carry = carry/10;
        }

        Collections.reverse(sumOfNum);
        System.out.println(sumOfNum);
    }
}
