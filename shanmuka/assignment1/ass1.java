
import java.util.Scanner;


/*1. Write a Java program to print 'Hello' on screen and then print your name on a separate line. Do the same single print statement?
2. Write a Java program to print the sum of two numbers?
3. Write a Java program to divide two numbers and print on the screen?
4.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers?
5.  Write a Java program to print the area and perimeter of a circle,square,rect angle, parallelogram etc...
6. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. 
7. Write a Java program to print the area and perimeter of a rectangle. 
8. Write a Java program to swap two variables.
9. Write a Java program to compare two numbers. 
10.Write a program to calculate EMI for given loan amount(Ex: Amount : 1,00,000 Tenure : 5 yrs, intrerest : EmI for month :17,093 with 1 % interest  )
11. Write a program to calculate kilo meters to meters and cm and vic versa
12. Write a program to calculate Hours to minutes & seconds and vic versa.
13. Write a program to calculate Kilo grams into grams and vic versa
14. Write a program to calculate Currency for diiferent countries.
15. Write a program to calculate Kb to MB and GB and vic versa
16. Write a program for BMI (Body Mass index)?
17. Write a program to calculate dicount of given price?
18. Write a program to calculate grade(Distinction,First,Second,Third) of  student based on average mark?
19. Write a program to calculate current bill based on units(Units : 1-100 - 3rs, 101- 200- 4rs, 201 -300- 5 rs, 301 and above 6 rs) ?
20. Wrtie a program to find Maximum of 3 numbers?
21. Wrtie a program to find Minium of 3 numbers?
22. Wrtie a program to find given number is odd/even ?
23. Wrtie a program to find given number is multiplied by 5 or not?
24. Wrtie a program to find suare of a given number?
25. Wrtie a program to calculate Gold rate(rate for grm 5250, 10 grms=1 tula) in cluding stones(each stone rate: 1500). Calute the price by mix of gold and stones and making charges will be 10 -18 */



public class ass1 {
    public static void main(String[] args) {
        //Write a Java program to print 'Hello' on screen and then print your name on a separate line. 
       //1. Do the same single print statement?

      /* System.out.println("Hello\nShanmuka Vamshi");  */ 



     //2.  Write a Java program to print the sum of two numbers?
    
    
    
    /*  Scanner scanner =new Scanner(System.in);
     System.out.println("Enter the first number : ");
     int num1 = scanner.nextInt();
     System.out.println("Enter the second number");
     int num2 = scanner.nextInt();

     int sum = num1 + num2;
     System.out.println("The sum of " + num1 + " and " + num2 + " is : " + sum );

      */



      //3. Write a Java program to divide two numbers and print on the screen?

      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the dividend : ");
      double dividend = scanner.nextDouble();

      System.out.println("Enter the divisor : ");
      double divisor = scanner.nextDouble();

      if (divisor != 0) {
        double result = dividend / divisor;
        System.out.println(" Result : "+result);
      }
      else
      {
        System.out.println("It is zero");
      }










    }
}