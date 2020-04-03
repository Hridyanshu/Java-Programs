/* Print the following pattern
12344321
123**321
12****21
1******1
*/

public class Pattern5
{
    public static void main(String args[])
    {
        for(int i=0;i<4;i++)
        {
            for(int j=1;j<=8;j++)
            {
                if(j<=4)
                {
                    if(j<=4-i)
                        System.out.print(j);
                    else
                        System.out.print("*");
                }
                else
                {
                    if(j>4+i)
                        System.out.print(9-j);
                    else
                        System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
