package Arrays;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for the matrices: ");
        int rows = obj.nextInt();
        int cols = obj.nextInt();

        int[][] mat1 = new int[rows][cols];
        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("element[" + i + "][" + j + "]:");
                mat1[i][j] = obj.nextInt();

            }
        }    
        
        
        int[][] mat2 = new int[rows][cols];
        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("element[" + i + "][" + j + "]:");
                mat2[i][j] = obj.nextInt();

            }
        }   

        System.out.println("First Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        int[][] sum = new int[rows][cols];
        System.out.println("The final matrix after addition is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        obj.close();
    }
    
}
