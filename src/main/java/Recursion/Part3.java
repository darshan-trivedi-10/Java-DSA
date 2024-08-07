package Recursion;

public class Part3 {
    public static void printAllSubSequence(String str, String output, int row){
        if(row >= str.length()){
            System.out.println("SUB-SEQUENCE : " + output);
            return;
        }

        printAllSubSequence(str, output + str.charAt(row), row + 1);
        printAllSubSequence(str, output, row + 1);
    }
    public static void main(String[] args) {
        printAllSubSequence("ABC", "", 0);
    }
}
