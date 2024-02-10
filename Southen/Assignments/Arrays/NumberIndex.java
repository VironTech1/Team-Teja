package arrays.southen.com;


import java.util.Scanner;
 class NumberIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {2, 4, 6, 8, 10, 12};
        for (int i = 0; i < numbers.length; i++) {
             System.out.println(numbers[i]);
        }
         System.out.println("enter the needed to find ");
        int target = scanner.nextInt(); // Number to find

        int index = -1; 
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break; 
            }
        }

        if (index != -1) {
            System.out.println("The number " + target + " is found at index: " + index);
        } else {
            System.out.println("The number " + target + " is not found in the array.");
        }
    }
}
