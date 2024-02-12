package assigment3;
//3. Java Program to Calculate the multiplication of first 10 Natural Numbers

import java.util.Scanner;

public class qus3 {
    public static void main(String[] args) {
        long multiplication = ResultMultiplication(10);

        System.out.println("multiplication of first 10 Natural Numbers : "+multiplication);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enetr the number n: ");
        int n1 = scanner.nextInt();
        long result1 = ResultMultiplication(n1);
        System.out.println("The multiplication of" +n1+" numbers : "+result1);



    }
    public static long ResultMultiplication(int n) {
        long result = 1;

        for(int i=1;i<=n;i++) {
            result = result * i;
        }

        return result;

    }
    
}
