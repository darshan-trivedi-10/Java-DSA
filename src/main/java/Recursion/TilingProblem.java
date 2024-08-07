package Recursion;

// https://www.geeksforgeeks.org/tiling-problem/
public class TilingProblem {

    public static int findTotalWays(int n){
        if(n <= 2){
            return n;
        }
        int vertically = findTotalWays(n-1);
        int horizontally = findTotalWays(n-2);

        return vertically + horizontally;
    }

    public static void main(String[] args) {
        System.out.println(findTotalWays(3));
        System.out.println(findTotalWays(4));
        System.out.println(findTotalWays(5));
    }
}
