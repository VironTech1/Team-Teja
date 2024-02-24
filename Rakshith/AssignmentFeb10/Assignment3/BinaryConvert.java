package Assignment3;

import java.util.Scanner;

public class BinaryConvert {
    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the Decimal number");
        int decimalNum= scn.nextInt();
        int a[]= new int[32];
        int i=0;
        while(decimalNum>0){
            a[i]= decimalNum%2;//0, 0, 0, 1
           decimalNum= decimalNum/2;//4,2,1,0
           i++;//1,2,3,4

        }
        for(int j=i-1;j>=0;j--){
            System.out.print(a[j]+" ");
        }


        }
    }

