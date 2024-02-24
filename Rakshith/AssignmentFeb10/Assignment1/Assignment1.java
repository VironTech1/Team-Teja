package Assignment1;

import java.util.Scanner;

public class Assignment1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello java , How are you Rakshith");

        System.out.println("Enter the value of number1");
        int number1 = scanner.nextInt();
        System.out.println("Enter the value of number2");
        int number2 = scanner.nextInt();
        System.out.println("Enter the value of number3");
        int number3 = scanner.nextInt();

        /*Arithmetic calculation of the numbers*/
        System.out.println("Sum of first two numbers:: " + (number1 + number2));
        System.out.println("Result after dividing numbers :: " + (number2 / number1));

        System.out.println("Addition of two numbers num1 & num2:: " + (number1 + number2));
        System.out.println("Subtraction of two numbers num1 & num2 :: " + (number1 - number2));
        System.out.println("Multiplication of two numbers num1 & num2 :: " + (number1 * number2));
        System.out.println("Division of two numbers num1 & num2 :: " + (number1 / number2));
        System.out.println("Remainder of two numbers num1 & num2 :: " + (number1 % number2));

        System.out.println("****************************************");

        System.out.println("Enter the length:: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width:: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height:: ");
        double height = scanner.nextDouble();
        System.out.println("Enter the radius:: ");
        double radius = scanner.nextDouble();
        double pi = 3.14;

        /*Calculating the area and perimeter of different geometric shapes*/

        System.out.println("Area of the Circle :: " + (pi * radius * radius));
        System.out.println("Area of the Square :: " + (length * length));
        System.out.println("Area of the Rectangle :: " + (length * width));
        System.out.println("Perimeter of a Rectangle :: " + (2 * (length * width)));
        System.out.println("Area of the Parallelogram :: " + (pi * radius * radius));
        System.out.println("Average of num1, num2 & num3 ::" + ((number1 + number2 + number3) / 3));


        /*Swapping of two numbers*/
        System.out.println("Swapping 2 numbers*********++++++=========");
        System.out.println("number1 is " + number1);
        System.out.println("number2 is " + number2);

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("After swapping  " + number1);
        System.out.println("After swapping  " + number2);

        /*Comparing two numbers*/
        System.out.println("Comparing the 2 num1 and numb2");
        if (number1 > number2) {
            System.out.println("number 1 is greater");
        } else {
            System.out.println("number2 is greater");
        }

        /*to calculate the emi for the given amount*/
        double Amount = 10000;
        double rateOfInterest = 1;
        double tenure = 60;
        double emi = ((Amount * tenure * rateOfInterest) / 100);
        System.out.println("Calculating the EMI for the amount " + (emi));

        /*Measuring conversions*/
        System.out.println("Converting the measurements");

        System.out.println("Enter the distance in Kilometers ");
        double kilometers = scanner.nextDouble();
        System.out.println("Kms to meters " + (kilometers * 1000));
        System.out.println("Kms to Centimeters " + (kilometers * 10000));

        System.out.println("Enter the distance in Centimeters ");
        double centimeters = scanner.nextDouble();
        System.out.println("Centimeters to meters " + (centimeters / 100));
        System.out.println("Centimeters to Kilometers " + (centimeters / 10000));

        /*Hours and Minutes conversion*/
        System.out.println("Enter the hours to convert in minutes and seconds ");
        int hours = scanner.nextInt();
        System.out.println("After converting into minutes " + (hours * 60));
        System.out.println("After converting into minutes  " + (hours * 3600));

        /*Weights conversion*/
        System.out.println("Enter the Weights for conversion ");
        int weight = scanner.nextInt();
        System.out.println("After converting into grams " + (weight * 1000));

        /*Calculate the Grade of the student*/
        System.out.println("Enter the Average marks ");
        int averageMarks = scanner.nextInt();
        int passMarks = 35;
        System.out.println("Enter the student secured marks");
        int studentMarks = scanner.nextInt();

        if (studentMarks > averageMarks) {
            System.out.println("Student passed with Distinction ");
        } else if (studentMarks <= averageMarks && studentMarks > passMarks) {
            System.out.println("Student Passed with First Class");
        } else {
            if (studentMarks == passMarks) {
                System.out.println("Student passed");
            } else {
                System.out.println("Student Failed");
            }
        }
        /*Find the maximum of 3 numbers*/
        System.out.println("Maximum of num1, num2 & num3");
        if (number1 > number2 && number1 > number3)
            System.out.println("Number 1 is greater");
        else if (number2 > number1 && number2 > number3) {
            System.out.println("Number 2 is greater");

        } else {
            System.out.println("Number 3 is greater than number 1 and Number 2");
        }
        /*Find the minimum of 3 numbers*/
        System.out.println("Minimum of num1, num2 & num3");
        if (number1 < number2 && number1 < number3)
            System.out.println("Number 1 is smaller");
        else if (number2 < number1 && number2 < number3) {
            System.out.println("Number 2 is snaller");

        } else {
            System.out.println("Number 3 is smaller than number 1 and Number 2");
        }

        /*Find the number is ODD or EVEN*/
        System.out.println("Enter the number to find EVEN or ODD");
        int evenOddNumber = scanner.nextInt();
        if (evenOddNumber % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is ODD");
        }

        /*To find the square of a given number*/
        System.out.println("Enter the number to find the square of it:: ");
        int squareNum = scanner.nextInt();
        System.out.println("Result of squaring the number:: " + (squareNum * squareNum));

        /*To find the number is multiple of 5*/
        System.out.println("Enter the number to find whether it is multiple of 5 ");
        int fiveMultipleNum = scanner.nextInt();
        if (fiveMultipleNum % 5 == 0) {
            System.out.println("Given number is multiple of 5");
        } else {
            System.out.println("Given number is NOT multiple of 5");
        }
        /*Currency Conversion program*/
        System.out.println("Currency conversion:::: ");
        double usdToPoundRate = 1.25;
        double usdToINRRate = 83.5;

        System.out.println("Enter the amount in USD");
        double amountInUSD = scanner.nextDouble();
        System.out.println("Amount in Indian rupees is :::" + (usdToINRRate * amountInUSD));
        System.out.println("Amount in Indian rupees is :::" + (usdToPoundRate * amountInUSD));

        /*Conversion from KB to MB and GB*/
        System.out.println("Conversion from Kb to MB and GB");
        System.out.println("Byte Converter");

        System.out.print("Enter size: ");
        double size = scanner.nextDouble();

        System.out.println("Choose the unit:");
        System.out.println("1. Kilobytes (KB)");
        System.out.println("2. Megabytes (MB)");
        System.out.println("3. Gigabytes (GB)");
        int choice = scanner.nextInt();
        double sizeInMB;
        double sizeInGB;
        double sizeInKB;
        switch (choice) {
            case 1:
                sizeInMB = size / 1024;
                sizeInGB = sizeInMB / 1024;
                System.out.println("size In MB --> " + sizeInMB + "MB");
                System.out.println("size In GB --> " + sizeInGB + "GB");
                break;
            case 2:
                sizeInKB = size * 1024;
                sizeInGB = size / 1024;
                System.out.println("size In MB --> " + sizeInKB + "MB");
                System.out.println("size In GB --> " + sizeInGB + "GB");
                break;
            case 3:
                sizeInKB = size * 1024;
                sizeInMB = sizeInKB / 1024;
                System.out.println("size In MB --> " + sizeInKB + "MB");
                System.out.println("size In GB --> " + sizeInMB + "GB");
                break;
            default:
                System.out.println("Invalid choice");
        }

        /*TO calculate the BMI*/
        System.out.println("To calculate the BMI ::");
        System.out.println("Enter the weight of the Person ");
        double personWeight = scanner.nextDouble();
        double personHeight = scanner.nextDouble();

        double bodyMassIndex = personHeight / (personHeight * personHeight);
        System.out.println("BMI of the above person is ::: " + bodyMassIndex);

        /*To calculate the discount of the given price*/
        System.out.println("*****To calculate the Discount of the given price*****::");
        System.out.println("Enter the original price:: ");
        double originalPrice = scanner.nextDouble();
        System.out.println("Enter the Discount percentage:: ");
        double discountPercentage = scanner.nextDouble();
        System.out.println("Price after the discount:::: " + ((originalPrice - discountPercentage) / 100) * originalPrice);

        /*To calculate the Current Bill*/
        System.out.println("*** To calculate late Current Bill ****");
        System.out.println("Enter the units used");
        double energyUnit = scanner.nextDouble();
        double currentBill;
        if (energyUnit <= 100) {
            System.out.println("Current bill ::: " + (3 * energyUnit));
        } else if (energyUnit > 100 && energyUnit <= 200) {
            System.out.println("Current bill ::: " + (4 * energyUnit));
        } else if (energyUnit > 200 && energyUnit <= 300) {
            System.out.println("Current bill ::: " + (5 * energyUnit));
        } else if (energyUnit > 300) {
            System.out.println("Current bill ::: " + (6 * energyUnit));
        }

        /*To calculate the GOLD price*/
        System.out.println("::To calculate total price of the ornaments::");
        System.out.println("Enter the gold used in grams::");
        double goldInGrams = scanner.nextDouble();
        System.out.println("Enter the no of stones used :: ");
        double noOfStones = scanner.nextDouble();
        double makingCharges = 15;
        double totalGoldRate = (goldInGrams * 5250) + (noOfStones * 1500) + makingCharges;
        System.out.println("Price of the Gold :: " + totalGoldRate);
    }
}
