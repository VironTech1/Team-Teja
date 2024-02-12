package assignment;
//9. Write a Java program to find duplicate numbers in an array

import java.util.Arrays;

public class qus9 {
    public static void main(String[] args) {
        int[] array = {12,23,34,45,56,67,78,89,99,23,34,56,56};

        findingduplicates(array);
    }

    public static void findingduplicates(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Duplicate numbers in the array:");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}