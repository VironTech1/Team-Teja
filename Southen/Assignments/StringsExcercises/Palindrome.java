
package com.southen.strings;


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string you want to check");
        
        String str = scanner.nextLine();
        String reversed = "";
        String original = str;
        
        for(int i = str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
        
        if(original.equals(reversed)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
    }
}
