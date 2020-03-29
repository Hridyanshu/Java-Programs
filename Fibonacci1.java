//This program implements Fibonacci Series without using recursion.

import java.util.Scanner;

public class Fibonacci1
{
        public static void main(String args[])
        {
                //Making object of scanner class.
                Scanner input = new Scanner(System.in);
                int terms = input.nextInt(); //taking number of terms as input.
                if(terms<=0)
                    System.out.println("Invalid input");
                else
                {
                    //temp1 and temp2 denote first and second terms of the series.
                    int temp1=0, temp2=1;
                    //Printing first term
                    System.out.print(temp1 + "\t");
                    for(int i=1; i<terms; i++)
                    {
                            System.out.print(temp2 + "\t");
                            temp2 = temp1 + temp2;
                            temp1 = temp2 - temp1;
                    }
                }
        }
}
