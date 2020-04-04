/* Print the following pattern
A
B B
C C C
D D D D
E E E E E      */

public class Pattern6
{
    public static void main(String args[])
    {
        for(int i=65;i<=69;i++)
        {
            for(int j=65;j<=i;j++)
                System.out.print((char)i);
            System.out.print("\n");
        }
    }
}
