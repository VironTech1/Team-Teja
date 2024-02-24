package arrays.southen.com;

import java.util.Scanner;

public class Even {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 78, 9};
        for (int i = 0; i < array.length; i++) {
            if(array[i] %2 ==0){
                System.out.println("the even numbers is " + array[i]);
            }
        }
    }
}

