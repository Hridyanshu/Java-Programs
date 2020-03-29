//Checks whether provided number is prime or not.

import java.util.Scanner;

public class PrimeChecker
{
        public static void main(String args[])
        {
                Scanner input = new Scanner(System.in);
                int number = input.nextInt();
                input.close();
                int i;
                for(i=2;i<number;i++)
                {
                        //checking divisibility
                        if(number%i==0)
                                break;
                }
                if(i==number)
                        System.out.println("Number is prime");
                else
                        System.out.println("Number is non-prime");
        }
}
