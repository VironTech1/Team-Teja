package Assignment3;

import java.util.Scanner;

public class Prime9Ten {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the number to find Prime or NOT:: ");
        int number = scn.nextInt();
        int counter=0;

        for(int i=1;i<=100;i++){
            if(number%i==0){
                counter++;
            }

        }
        if(counter>2){
            System.out.println("not prime");
        }
        else if(counter<=2){
            System.out.println("prime");
        }
        int counter1=0;
        for(int i=1;i<100;i++){
            counter1=0;
            for(int j=1;j<100;j++){
                if(i%j==0){
                    counter1++;

                }

            }
            if(counter1<=2){
                System.out.println("the number : "+i+" is prime ");
            }

        }

    }

}
