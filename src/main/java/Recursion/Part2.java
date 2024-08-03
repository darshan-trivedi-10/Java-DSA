package Recursion;

public class Part2 {
    /*
    Given a number X, calculate the count of number of binary string of length X, which has no consecutive ones.
    Ex : N = 3
    Ans = 5 (101, 001, 000, 010, 100)
    */
    public static int q1(int n, int last, int row){
        if(row == n){
            return 1;
        }
        if(last == 0){
            return q1(n, 0, row + 1) + q1(n, 1, row + 1);
        }else{
            return q1(n, 0, row + 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(q1(3, 0, 0));
    }
}
