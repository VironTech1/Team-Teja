import java.util.Scanner;
public class Bodymass
{
  public static void main(String[] args)
  {
    Scanner body = new Scanner(System.in);
    System.out.println("Enter weight: ");
    double weight = body.nextInt();
    System.out.println("Enter height: ");
    double height = body.nextInt();
    double BMI = weight/(height*height);
    System.out.println("BMI:" +BMI);
    if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("Normal weight");
        } else if (BMI >= 25 && BMI < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
  }  
}