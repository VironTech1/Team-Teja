package com.southen.strings;

import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("enter any main string");
        String text = scanner.nextLine();
        
        System.out.println("enter the index ");
        int index = scanner.nextInt();
        
        
        System.out.println(text.charAt(index));
        
    }
}
