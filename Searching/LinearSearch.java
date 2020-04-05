//Program implementing Linear search in an integer array.

import java.util.Scanner;

public class LinearSearch
{
    static int search(int arr[], int key)
    {
        //will return the first index in case of successful search.
        //will return -1 in case of unsuccessful search.
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == key)
                return i;
        }
        return (-1);
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.print("Enter the elements of array: ");
        //taking array as input.
        for(int i=0;i<size;i++)
            array[i] = input.nextInt();
        System.out.print("Enter the key(value) you wish to search for: ");
        int key = input.nextInt();
        input.close();
        int result = search(array, key);
        if(result==(-1))
            System.out.println("Key not found!!");
        else
            System.out.println("Key found at index: " + result);
    }
}
