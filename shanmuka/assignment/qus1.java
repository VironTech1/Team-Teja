package assignment;
import java.util.Scanner;

public class qus1 {

    public static void main(String[] args) {
        int [] numbers = { 32 , 59 , 48 , 66 ,12, 28};


        //question 2 Write a Java program to print the values from an array?


        System.out.println("Arrays Elements : ");
        for(int i = 0 ; i < numbers.length ; i++)
        System.out.println(numbers[i]);




        System.out.println("User input ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();


        int[] num = new int[n];

        System.out.println("Enter "+ n + "elements for the array : ");
        for(int i = 0; i<n ; i++){
            System.out.println("Elements " + (i+1)  + " : ");
            num[i] = scanner.nextInt(); 
        }

        scanner.close();

        System.out.println("Array Elements : ");
        for ( int i = 0 ; i < n ; i++ ) {
            System.out.println(num[i] + " ");
        }





            }
        
        
    
}

/*

1. Write a Java program to create an single dimension array and initialise the values?
2. Write a Java program to print the values from an array?
3. Write a Java program to fina a given number in an array and if it found print it's index
4. Write a Java program to sum the elements of an array
5. Write a Java program to print even numbers from an array
6. Write a Java program to print odd numbers from an array
7. Write a Java program to find max and min number from an array
8. Write a Java program to copy from one array into another
9. Write a Java program to find duplicate numbers in an array
10. Write a Java program to swap two numbers in an given indexes


 */
