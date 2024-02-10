
public class Alltable
{
    public static void main(String[] args)
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println("Multiplication Table of " + i + ":");
            for(int j=1; j<=10; j++)
            {
                int n = i * j;
                System.out.println(i+ " * " + j + " = " +n);
            }
            System.out.println();
        }
    }
}