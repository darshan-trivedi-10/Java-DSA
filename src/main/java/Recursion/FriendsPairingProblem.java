package Recursion;

// https://leetcode.com/discuss/general-discussion/1349122/friends-pairing-problem
public class FriendsPairingProblem {
    public static int countTotalPairs(int n){
        if(n <= 1){
            return n;
        }

        int notPair = countTotalPairs(n-1);
        int pair = (n-1) * countTotalPairs(n - 2);

        return pair + notPair;
    }

    public static void main(String[] args) {
        System.out.println(countTotalPairs(3));
        System.out.println(countTotalPairs(4));
    }
}
