//Calculating factorial of a number.

import java.util.Scanner;
public class Factorial
{
    //The range is calculating factorials upto 19.
    public static int fact(int n)
    {
        int fac = 1;
        for(int i=1;i<=n;i++)
            fac = fac*i;
        return fac;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        System.out.println("Factorial of " + num + " = " + fact(num) );
    }
}
