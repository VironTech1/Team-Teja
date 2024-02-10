public class Traingle
{
    public static void main(String a[])
    {
        int i;
        int j;
        int k;
        for(i=1; i<=4; i++)
        {
            for(j=1; j<=4-i; j++)
            {
                System.out.print(" ");
            }     
                for(k=1; k<2*i; k++)
                {
                  System.out.print('*');
                }
            System.out.println();
            }
        }
    }