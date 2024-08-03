import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Java Provided different ways to get input from the user.
        // Scanner
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(num);

        input.close();
    }
}
