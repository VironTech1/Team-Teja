//5.  Write a Java program to print the area and perimeter of a circle,square,rect angle, parallelogram etc...
import java.util.Scanner;

public class qus5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;
        double circlePerimeter = 2 * Math.PI * radius;;
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Perimeter: " + circlePerimeter);


        System.out.print("Enter the side length of the square: ");
        double squareSide = scanner.nextDouble();
        double squareArea = squareSide * squareSide;
        double squarePerimeter = 4 * squareSide;;
        System.out.println("Square Area: " + squareArea);
        System.out.println("Square Perimeter: " + squarePerimeter);

   
        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        double rectangleArea = rectangleLength * rectangleWidth;
        double rectanglePerimeter = 2 * (rectangleLength + rectangleWidth);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);


        System.out.print("Enter the base of the parallelogram: ");
        double parallelogramBase = scanner.nextDouble();
        System.out.print("Enter the height of the parallelogram: ");
        double parallelogramHeight = scanner.nextDouble();
        double parallelogramArea = parallelogramBase * parallelogramHeight;
        double parallelogramPerimeter = 2 * (parallelogramBase);
        System.out.println("Parallelogram Area: " + parallelogramArea);
        System.out.println("Parallelogram Perimeter: " + parallelogramPerimeter);

        scanner.close();
    }

}
