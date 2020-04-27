/* Program to reverse a string*/

import java.util.Scanner;

public class StringReverse
{
    public static void main(String args[])
    {
        //creating object of scanner class to take inputs.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        //taking string input
	String s = input.nextLine();
	//making a new string builder that stores the provided string
        StringBuilder string = new StringBuilder(s);
	//reversing the stringbuilder and converting it to string
        String revstring = string.reverse().toString();
        System.out.print("Reverse string is: " + revstring);
    }
}
