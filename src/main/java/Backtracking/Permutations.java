package Backtracking;

import java.util.Scanner;

public class Permutations {
    public static void printPermutations(StringBuilder s, int left, int right){
        if(left == right){
            System.out.println(s.toString());
            return;
        }

        for (int i = left; i < right; i++){
            swapChar(s, left, i);
            printPermutations(s, left + 1, right);
            swapChar(s, left, i);
        }
    }

    private static void swapChar(StringBuilder s, int left, int i) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(left));
        s.setCharAt(left, temp);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        printPermutations(new StringBuilder(s), 0, s.length() - 1);
    }


}
