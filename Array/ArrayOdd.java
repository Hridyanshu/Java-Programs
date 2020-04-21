/* Program to print the elements present at even indices of the array. */

import java.util.Scanner;

public class ArrayOdd
{
    public static void main(String args[])
    {
        //creating object of scanner class for taking inputs.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        //Declaring the array
        int array[] = new int[size];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<size;i++)
        {
            //receiving array elements
            array[i] = input.nextInt();
        }
        input.close();
        System.out.print("Elements at even indices are: ");
        for(int i=0;i<array.length;i++)
        {
            if(i%2!=0)
                System.out.print(array[i] + "\t");
        }
    }
}
