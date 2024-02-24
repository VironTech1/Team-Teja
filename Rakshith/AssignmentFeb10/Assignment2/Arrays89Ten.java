package Assignment2;
import java.util.*;
import java.util.Scanner;


public class Arrays89Ten {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = scn.nextInt();
        int[] firstArray = new int[size];
        int[] secondArray = new int[firstArray.length];
        int i;
        System.out.println("Enter the values for the array::: ");
        for (i = 0; i < size; i++) {
            firstArray[i] = scn.nextInt();

        }
        System.out.println("Array elements are :: ");
        for (i = 0; i < firstArray.length; i++) {
            System.out.println("" + firstArray[i]);
        }

        /*#8  Copy elements from first array to second array*/
        for (i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }
        System.out.println("Original Array is ------ :: ");
        for (i = 0; i < firstArray.length; i++) {
            System.out.println(" " + firstArray[i]);
        }
        System.out.println("Copied Array is ------- :: ");
        for (i = 0; i < secondArray.length; i++) {
            System.out.println(" " + secondArray[i]);
        }
        System.out.println();

        /*To find the duplicate numbers in an array*/

        System.out.println("**** To find the duplicate numbers in an array ****");
        for (i = 0; i < firstArray.length; i++) {
            for (int j = i + 1; j < firstArray.length; j++) {
                if (firstArray[i] == firstArray[j]) {
                    System.out.print(firstArray[j] + " ");
                    break;
                }
            }
        }
        System.out.println();
        /*Swap the numbers for the given index.*/
        System.out.println(" To swap the numbers for the given index ");
        System.out.println(" Enter index1 to swap ");
        int index1 = scn.nextInt();
        System.out.println(" Enter index2 to swap ");
        int index2 = scn.nextInt();
           boolean swap=false;

        if( (index1 >= 0 || index1 < firstArray.length) && (index2 >= 0 || index2 < firstArray.length)) {
            int temp = firstArray[index1];
            firstArray[index1] = firstArray[index2];
            firstArray[index2] = temp;
            System.out.println("Array after swapping elements");
            for (i = 0; i < firstArray.length; i++) {
                System.out.println("" + firstArray[i]);
            }

            swap=true;
        }
        if(swap==false){
            System.out.println("Swap not possible");
        }

    }


}

