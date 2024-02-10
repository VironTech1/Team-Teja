package assignment;

import java.util.Scanner;

//Write a Java program to fina a given number in an array and if it found print it's index
public class qus3 {

    public static void main(String[] args) {
        int[] numbers = { 23, 98 , 44 , 76 , 29 , 61};

        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the number to be Find : ");
        int findnum = scanner.nextInt();
        boolean found = false ;
        
        for(int i = 0; i<numbers.length; i++ ){
            if (numbers[i] == findnum) {
                System.out.println("The number is Found at index : " +i);
               // found = true;
                //break;
            }

        }
        //if(found == false){
          //  System.out.println("Number is not in the array : " +findnum);
        //}

        
        
        
    }

 
}
