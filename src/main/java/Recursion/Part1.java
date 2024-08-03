package Recursion;

/*
* Base Case
* Self Work
* Assumptions
* */
public class Part1 {
    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }

        return n * factorial(n-1);
    }

    // a^b
    public static int power(int a, int b){
        if (b == 0){
            return 1;
        }
        return a * power(a, b-1);
    }

    public static void printIncreasingNumber(int n){
        if(n == 0){
            return;
        }
        printIncreasingNumber(n-1);
        System.out.println(n);
    }

    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println("Hello : " + fibonacci(10));
        System.out.println(factorial(10));
        System.out.println(power(2, 5));
        printIncreasingNumber(10);
    }

}
