//Implementing Bubble Sort

import java.util.Scanner;

class BubbleSort
{
    int[] bubblesort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //Swapping
                    arr[j+1] = arr[j+1] + arr[j];
                    arr[j] = arr[j+1] - arr[j];
                    arr[j+1] = arr[j+1] - arr[j];
                }
            }
        }
        return arr;
    }
}
public class BubbleSortImplementation
{
    public static void main(String args[])
    {
        BubbleSort bs = new BubbleSort();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.print("Enter the array: ");
        for(int i=0;i<size;i++)
        {
            //Reading the array.
            array[i] = input.nextInt();
        }
        array = bs.bubblesort(array);
        System.out.print("Sorted array is: ");
        for(int i=0;i<size;i++)
        {
            //Displaying the sorted array.
            System.out.print(array[i] + "\t");
        }
    }
}
