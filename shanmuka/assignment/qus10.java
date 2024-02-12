package assignment;
//10. Write a Java program to swap two numbers in an given indexes

public class qus10 {
    public static void main(String[] args) {
        int[] array = {12,23,34,45,56};

        int index1 = 1;
        int index2 = 3;

        System.out.println("Array first time : ");
        for(int num : array) {
            System.out.println(num + " ");
        }

        swapfunction(array, index1 , index2);

        System.out.println("\n Swaped Array : ");
        for(int num : array) {
            System.out.println(num + " ");
        }
    }

    public static void swapfunction(int[] arr, int index1, int index2) {
        if (index1>=0 && index1<arr.length && index2 >=0 && index2<arr.length) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        } 
        else {
            System.out.println("Wrong indices. We can't Swap.");
        }   
    }
}
