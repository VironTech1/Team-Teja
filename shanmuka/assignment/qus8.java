package assignment;
//8. Write a Java program to copy from one array into another

public class qus8 {
    public static void main(String[] args) {
        int[] sourceArray = {12, 33, 28, 45, 65};
        int[] destinationArray = new int[sourceArray.length];
        copyFunction(sourceArray, destinationArray);
        System.out.println("The destination array: ");
        for (int num : destinationArray) {
            System.out.print(num + " ");
        }
    }

    public static void copyFunction(int[] source, int[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }
}
