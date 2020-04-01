/* Print the following pattern
1     1
 2   2
  3 3
   4
  3 3
 2   2
1     1     */
 
public class Pattern4
{
    public static void main(String args[])
    {
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if(j==i || j==8-i)
                {
                    if(i>4)
                        System.out.print(8-i);
                    else
                        System.out.print(i);
                }
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
