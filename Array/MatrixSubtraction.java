/* Subtracting two matrices */

import java.util.Scanner;

public class MatrixSubtraction
{
    public static void main(String args[])
    {
        //creating the object of scanner class to take inputs.
        Scanner input = new Scanner(System.in);
        //below variables are taking the order of matrices.
        //both matrices are bound to have same order.
        int rowcount, columncount;
        System.out.print("Enter the number of rows in the matrices: ");
        rowcount = input.nextInt();
        System.out.print("Enter the number of columns in the matrices: ");
        columncount = input.nextInt();
        //declaring the matrices
        int matrix1[][] = new int[rowcount][columncount];
        int matrix2[][] = new int[rowcount][columncount];
        System.out.println("Enter the elements of first matrix");
        //reading first matrix.
        for(int i=0;i<rowcount;i++)
        {
            for(int j=0;j<columncount;j++)
                matrix1[i][j] = input.nextInt();
        }
        System.out.println("Enter the elements of second matrix");
        //reading second matrix.
        for(int i=0;i<rowcount;i++)
        {
            for(int j=0;j<columncount;j++)
                matrix2[i][j] = input.nextInt();
        }
        input.close();
        System.out.println("Subtraction matrix is:");
        //displaying the matrix.
        for(int i=0;i<rowcount;i++)
        {
            for(int j=0;j<columncount;j++)
                System.out.print((matrix1[i][j] - matrix2[i][j]) + "\t");
            System.out.print("\n");
        }
    }
}
