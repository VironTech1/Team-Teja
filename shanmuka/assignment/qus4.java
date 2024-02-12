//4. Write a Java program to sum the elements of an array
package assignment;
public class qus4 {
    public static void main(String[] args) {
        int[] numbers = { 2 , 23 , 28, 32 , 78 , 99};
        int sum = 0;
        for(int i=0; i<numbers.length; i++)
        {
            sum= sum + numbers[i];
        }
        System.out.println("The Total Sum Of Array : "+sum);
    }
}
