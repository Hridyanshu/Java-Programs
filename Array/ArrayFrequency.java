/* Program to find the frequency of each element in the array */
import java.util.Scanner;

public class ArrayFrequency
{
    static int[] sort(int array[])
    {
        //sorting the array using bubble sort
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    //swapping
                    array[j] = array[j] + array[j+1];
                    array[j+1] = array[j] - array[j+1];
                    array[j] = array[j] - array[j+1];
                }
            }
        }
        return array;
    }
	public static void main(String args[])
    	{
        	//Creating object id Scanner class to take input.
        	Scanner input = new Scanner(System.in);
        	//size stores the size of the array.
        	int size;
        	System.out.print("Enter the size of array: ");
      		size = input.nextInt();
        	//Declaring the array.
        	int arr[] = new int[size];
        	System.out.print("Enter the elements of array: ");
        	//taking array as input.
        	for(int i=0;i<size;i++)
            		arr[i] = input.nextInt();
        	//sorting the array using sort method.
        	arr = sort(arr);
    	}
}
