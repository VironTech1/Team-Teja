//6. Write a Java program to print odd numbers from an array
package assignment;

public class qus6 {
    public static void main(String[] args) {
        int[] numbers={23,34,45,56,67,78,89};
        for(int i=0;i< numbers.length ;i++)
        {
            if((numbers[i] & 1)!=0)
            {
                System.out.println(numbers[i]+" is an Odd number");
            }
        }
        
    }
    
}
