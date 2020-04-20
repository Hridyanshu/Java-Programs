/* Program to print the duplicate elements of an array */

import java.util.Scanner;

public class DuplicateElement
{
    static int[] sort(int arr[])
    {
        //sorting the array using the bubble sort
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swapping
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
        return arr;
    }
    public static void main(String args[])
    {
        //creating object of scanner classs for taking inputs.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        //declaring the array
        int array[] = new int[size];
        System.out.print("Enter the elements of the array: ");
        //taking array elements as input.
        for(int i=0;i<size;i++)
            array[i] = input.nextInt();
        input.close();
        //sorting the array
        array = sort(array);
        int temp = array[0];
        System.out.print("Duplicate elements of the array are: ");
        for(int i=1;i<array.length;i++)
        {
            if(array[i]==array[i-1])
            {
                if(i==1)
                    System.out.print(array[i] + "\t");
                else if(array[i]!=temp)
                {
                    System.out.print(array[i] + "\t");
                    temp = array[i];
                }
            }
        }
    }
}
