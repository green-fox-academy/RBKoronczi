import java.util.Arrays;
import java.util.Scanner;

public class DiagonalMatrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Matrix Size: ");
        int matrixSize = myScanner.nextInt();
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i==j) {
                    matrix[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(matrix[i]));
        }

    }
}
