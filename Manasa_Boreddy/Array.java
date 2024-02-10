import java.util.Scanner;
// sum of array
/* public class Array
{
    public static void main(String[] args)
    {
        int a[] = {3, 5, 7, 9, 10};
        int sum = 0;
        for(int i=0; i<a.length; i++)
        {
            sum = sum + a[i];
        } 
        System.out.println("Sum of arrays: " +sum);
    }
} */

//even numbers from an array
/* public class Array
{
    public static void main(String[] args)
    {
        int a[] = {3, 5, 6, 9, 10};
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2 == 0)
            {
                System.out.println(a[i]);
            }
           
        }
    }
} */

//odd numbers from an array
/* public class Array
{
    public static void main(String[] args)
    {
        int a[] = {3, 5, 6, 9, 10};
        System.out.println("Odd numbers from an array: ");
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2 != 0)
            {
                System.out.println(a[i]);
            }
           
        }
    }
} */

//max and min of array
/* public class Array
{
    public static void main(String[] args)
    {
        int a[] = {3, 5, 6, 9, 10};
        int max = a[0], min = a[0];
        System.out.println("max and min from an array: ");
        for(int i=0; i<a.length; i++)
        {
            if(a[i] > max)
            {
                max = a[i];    
            }
            else if (a[i] < min)
            {
                min = a[i];
            }    
        }
          System.out.println("max num: " +max);
          System.out.println("max num: " +min);
    }
} */


public class Array
{
    public static void main(String[] args)
    {
        int a[] = {15, 5, 12, 9, 2};
        int max = a[0], min = a[0];
        System.out.println("max and min from an array: ");
        for(int i=0; i<a.length; i++)
        {
            if(a[i] > max)
            {
                max = a[i];    
            }
            else if (a[i] < min)
            {
                min = a[i];
            }    
        }
          System.out.println("max num: " +max);
          System.out.println("min num: " +min);
    }
} 

