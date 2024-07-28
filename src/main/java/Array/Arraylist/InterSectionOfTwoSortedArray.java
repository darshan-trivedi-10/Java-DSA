package Array.Arraylist;

import java.util.ArrayList;

public class InterSectionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] one = {10, 20, 24, 27, 30, 32, 45, 50};
        int[] two = {20, 24, 30, 45, 50, 70, 90, 100};
        System.out.println(interSection(one, two));
    }

    public static ArrayList<Integer> interSection(int[] one, int[] two){
        ArrayList<Integer> commonNumber = new ArrayList<>();
        int i = 0, j = 0;
        while (i < one.length && j < two.length) {
            if(one[i] < two[j]){
                i++;
            }else if(two[j] < one[i]){
                j++;
            }else {
                commonNumber.add(one[i]);
                i++;
                j++;
            }
        }
        return commonNumber;
    }

}