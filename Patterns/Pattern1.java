/*Print the following pattern
5432*
543*1
54*21
5*321
*4321    */

public class Pattern1
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=1;j--)
            {
                if(j==i)
                    System.out.print("*");
                else
                    System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
