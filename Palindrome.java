//Checking whether a given number is palindrome or not.

import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        input.close();
        //temporarily storing the last digit of the reduced number.
        int rem;
        //storing number in temp to preserve its value.
        int temp = num;
        int reverse_num=0; //storing the reversed num.
        while(temp>0)
        {
            rem = temp%10;
            reverse_num = (reverse_num*10) + rem;
            temp = temp/10;
        }
        if(reverse_num==num)
            System.out.println("Given number is palindrome");
        else
            System.out.println("Given number is not palindrome");
    }
}
