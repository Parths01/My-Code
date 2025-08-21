import java.util.Scanner;

public class MatrixAddition {

    private int rows, cols;
    private int[][] matrix1, matrix2, sum;

    public void inputMatrices(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows :");
        rows = sc.nextInt();
        System.out.println("Enter the columns :");
        cols = sc.nextInt();

        matrix1 = new int[rows][cols];
        matrix2 = new int[rows][cols];
        sum = new int[rows][cols];

        System.out.println("Enter the 1st matrix :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the 2nd matrix :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

    
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        System.out.println("Product of the given matrix are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MatrixAddition ma = new MatrixAddition();
        ma.inputMatrices();
    }
}
