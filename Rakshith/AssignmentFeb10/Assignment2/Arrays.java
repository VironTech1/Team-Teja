package Assignment2;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        /*Print the array and initialize a single dimensional array*/
        System.out.println("Enter the values for the array::: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value for element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Elements in the array are::: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Array element" + (i + 1) +" "+ array[i]);

        }
        for (int i =0; i< array.length;i++){
            System.out.println(array[i] +"");
        }

        /*To find the element and if so, to print the index*/
        int count=0;
        System.out.println("Enter the number to find::: ");
          int number= scanner.nextInt();
          for(int i= 0 ;i< array.length;i++){
              if(number==array[i]){
                  System.out.println("Number matched at index :: "+i);
                  count++;

              }
          } if(count==0){
            System.out.println("Matching number not found:: ");
        }

          /*#4 Sum of elements of an array*/
        int arraySum=0;
        for (int i=0;  i< array.length; i++){
             arraySum = arraySum + array[i];
        }
        System.out.println("Sum of numbers"+arraySum);

    }

    public static String toString(int i) {

        return null;
    }
}
