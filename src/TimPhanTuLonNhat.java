import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
                {10,21,99,42,54},
                {57,67,78,30,39},
                {70,13,21,60,14},
                {31,26,17,52,81}
        };

        System.out.println("Mảng 2 chiều gồm " + matrix.length + " hàng và " + matrix[0].length + " cột");
        // i : row , j : column
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int Max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (Max < matrix[i][j]){
                    Max = matrix[i][j];
                }
            }
        }
        System.out.println("GTLN trong mảng : " + Max);

    }
}
