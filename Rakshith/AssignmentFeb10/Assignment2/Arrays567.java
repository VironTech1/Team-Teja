package Assignment2;

import java.util.Scanner;

public class Arrays567 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int i;

        System.out.println("Enter the values for the array::: ");
        for ( i = 0; i < size; i++) {
            System.out.println("Enter the value for element: " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array elements are :: ");
        for ( i = 0; i < array.length; i++) {
            System.out.println(""+ array[i]);

        }

        System.out.println();

        /*#5  To print EVEN numbers in an array*/
        System.out.println("****** Even numbers in the given array *********");
        for ( i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(""+array[i]);
            }
        }

        /*#5  To print ODD numbers in the given array*/
        System.out.println("****** ODD numbers in the given array *********");
        for ( i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(""+array[i]);
            }
        }
        System.out.println();
        /*To find Max and Min element from an Array*/
        System.out.println("***** To find Max and Min element from an Array *****");
        int maxArrayEle= array[0];
        int minArrayEle=array[0];
        for ( i = 0; i < array.length; i++){
            if(array[i]>maxArrayEle){
                maxArrayEle=array[i];
            }

            if(array[i]<minArrayEle){
                minArrayEle=array[i];
            }
        }
        System.out.println("Maximum element in the given array::: "+maxArrayEle);
        System.out.println("Minimum element in the given array::: "+minArrayEle);
    }
}
