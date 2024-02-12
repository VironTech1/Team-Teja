package com.southen.strings;

import java.util.Scanner;

public class SplitName {
	

	    public static void main(String[] args) {
	    	

			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("enter name");
			
			
			String fullName = scanner.nextLine();
			
			
	        String[] nameParts = fullName.split(" ");
	        
	        int k = nameParts.length;
	      
	       
	       System.out.println("first name:" + nameParts[0]);
	       
	       System.out.println("last name:" + nameParts[k-1]);
	     }
	           
	    }

	 



