/*Print the following pattern
*000*000*
0*00*00*0
00*0*0*00
000***000    */

public class Pattern2
{
    public static void main(String args[])
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(j==i||j==(8-i)||j==4)
                    System.out.print("*");
                else
                    System.out.print(0);
            }
            System.out.print("\n");
        }
    }
}
