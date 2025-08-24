package Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the first matrix:");
        int r1 = obj.nextInt();
        int c1 = obj.nextInt();
        System.out.println("Enter the number of rows and columns of the second matrix:");
        int r2 = obj.nextInt();
        int c2 = obj.nextInt();

        if (c1 != r2) {
            System.out.println("Can't perform multiplication :(");
            System.out.println("Number of columns of first matrix must be equal to number of rows of second matrix.");
        } else {
            int[][] mat1 = new int[r1][c1];
            System.out.println("Enter the elements of the first matrix:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print("Element[" + i + "][" + j + "]: ");
                    mat1[i][j] = obj.nextInt();
                }
            }

            int[][] mat2 = new int[r2][c2];
            System.out.println("Enter the elements of the second matrix:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print("Element[" + i + "][" + j + "]: ");
                    mat2[i][j] = obj.nextInt();
                }
            }

            System.out.println("\nFirst Matrix:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(mat1[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nSecond Matrix:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(mat2[i][j] + " ");
                }
                System.out.println();
            }

            // Multiplication logic
            int[][] result = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    result[i][j] = 0; // initialize before sum
                    for (int k = 0; k < c1; k++) { 
                        result[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }

            System.out.println("\nResultant Matrix (Multiplication):");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        obj.close();
    }
}
