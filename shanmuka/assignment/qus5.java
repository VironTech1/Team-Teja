//5. Write a Java program to print even numbers from an array
package assignment;
public class qus5 {
    public static void main(String[] args) {
        int[] numbers={12, 23, 34, 45, 56, 67, 78};
        for(int i=0; i<numbers.length;i++)
        {
            if((numbers[i]%2) == 0)
            {
                System.out.println(+numbers[i]+" is an even number.");
            }
            else
            {
                System.out.println(+numbers[i]+" is an odd number.");
            }
        }
    }
    
}
