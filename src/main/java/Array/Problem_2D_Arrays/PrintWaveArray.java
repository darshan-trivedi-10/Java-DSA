package Array.Problem_2D_Arrays;

public class PrintWaveArray {
    public static void main(String[] args) {
        Integer[][] array = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9},
                {10, 11, 12, 13}
        };

        for(int i = 0; i < array[0].length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.println(array[j][i]);
            }
        }
    }
}
