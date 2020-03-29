//This program implements Fibonacci series using recursion.

import java.util.Scanner;
public class Fibonacci2
{
    public static int fib(int n)
    {
        //returns n'th term of the fibonacci series.
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return (fib(n-1) + fib(n-2));
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int terms = input.nextInt();
        input.close();
        //printing the series
        for(int i=0;i<terms;i++)
        {
            System.out.print(fib(i) + "\t");
        }
    }
}
