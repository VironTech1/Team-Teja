package assigment3;

import java.util.Scanner;

public class qus15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        if (decimalNumber == 0) {
            System.out.println("Binary representation: 0");
        } else {
            StringBuilder binary = new StringBuilder();

            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binary.insert(0, remainder); 
                decimalNumber /= 2;
            }

            System.out.println("Binary representation: " + binary.toString());
        }
    }
}
