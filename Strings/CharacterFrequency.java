/* Java Program to find the frequency of characters */

import java.util.Scanner;

public class CharacterFrequency
{
    static char[] sort(char array[])
    {
        char temp;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    //swapping
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        //string input
        String str = input.nextLine();
        //changing string to char array.
        char arr[] = str.toCharArray();
        //sorting the array
        arr = sort(arr);
        int frequency = 1;
        System.out.println("Character\tFrequency");
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                frequency++;
            }
            else
            {
                System.out.println(arr[i-1] + "\t\t\t" + frequency);
                frequency = 1;
            }
        }
    }
}
