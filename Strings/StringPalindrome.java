/* Program to reverse a string*/

import java.util.Scanner;

public class StringPalindrome
{
    public static void main(String args[])
    {
        //creating object of scanner class to take inputs.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = input.nextLine();
        StringBuilder string = new StringBuilder(s);
        String revstring = string.reverse().toString();
        if(s.equals(revstring))
            System.out.print("Palindrome");
        else
            System.out.print("Not Palindrome");
    }
}
