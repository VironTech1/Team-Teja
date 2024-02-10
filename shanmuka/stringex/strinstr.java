package stringex;

import java.util.Scanner;

public class strinstr {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the string to search within: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the substring to find: ");
        String find = scanner.nextLine();

        int index = str1.indexOf(find);
        
        if (index != -1) {
            System.out.println("Substring '" + find + "' found at index: " + index);
        } else {
            System.out.println("Substring '" + find + "' not found in the given string.");
        }
        
        scanner.close();

    }
}
