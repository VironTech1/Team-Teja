package com.southen.strings;


import java.util.Scanner;

public class Contains{
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	 System.out.println("enter any main string");
        String text = scanner.nextLine();
        System.out.println("enter substring to find");
        String substring =scanner.nextLine();
        
        boolean isFound = text.contains(substring);
       
        if(isFound){
           System.out.println("yes we Found it");
        }else{
            System.out.println("Not Found");
        }
        
    }
}

 

