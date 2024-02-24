package com.southen.strings;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string you want to reverse");
        
        String str = scanner.nextLine();
        String reversed = "";
        
        for(int i = str.length()-1; i>=0; i--) {
        	reversed += str.charAt(i);
        }
        
        System.out.println(reversed);

	}

}
