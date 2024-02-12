package arrays.southen.com;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 78, 9};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i]; 
        }

        System.out.println("Sum of the array elements: " + sum);
    }
}

