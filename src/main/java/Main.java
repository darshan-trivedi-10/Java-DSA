import java.util.Scanner;

public class Main {
    public static int getTotalCount(String s, int index){
        if(index == s.length()){
            return 1;
        }

        if(index != s.length()-1 && Integer.valueOf(s.substring(index, index + 2)) <= 26){
            return getTotalCount(s, index + 2) + getTotalCount(s, index + 1);
        }
        return getTotalCount(s, index + 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            String s = input.next();
            System.out.println(getTotalCount(s, 0));
        }
    }
}

/*
Input:
25114
1111111111
3333333333
0

Output:
6
89
1
* */