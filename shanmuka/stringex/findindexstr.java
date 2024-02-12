package stringex;

import java.util.Scanner;

public class findindexstr {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String str1 = scanner.nextLine();
         char find = 'a';

        for(int i=0;i< str1.length();i++)
        {
            if (str1.charAt(i) == find) {
                System.out.println("Found at : " +i );

            }
        }
        System.out.println("Hello".concat(" World").toUpperCase().toLowerCase().substring(2).length());

    }
    
}
