/* Program to copy all elements of one array into another array */

import java.util.Scanner;

public class ArrayCopy
{
    public static void main(String args[])
    {
        //size of the array
        int size;
        System.out.print("Enter the size of the array: ");
        //object of scanner class for taking inputs.
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        //declaring the array
        int array[] = new int[size];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<size;i++)
        {
            //taking array as input
            array[i] = input.nextInt();
        }
        input.close();
        //copyarray will store the copied array.
        int copyarray[] = new int[array.length];
        //copying the array
        System.arraycopy(array, 0, copyarray, 0, array.length);
        System.out.print("The copied array is: ");
        //printing the copied array.
        for(int i:copyarray)
            System.out.print(i + "\t");
    }
}
