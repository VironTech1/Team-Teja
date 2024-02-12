import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;
        double circlePerimeter = 2 * Math.PI * radius;
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Perimeter: " + circlePerimeter);

        // Square
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();
        double squareArea = sideLength * sideLength;
        double squarePerimeter = 4 * sideLength;
        System.out.println("Square Area: " + squareArea);
        System.out.println("Square Perimeter: " + squarePerimeter);

        // Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);

        // Parallelogram
        System.out.print("Enter the base of the parallelogram: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the parallelogram: ");
        double heightParallelogram = scanner.nextDouble();
        double parallelogramArea = base * heightParallelogram;
        double parallelogramPerimeter = 2 * (base + heightParallelogram);
        System.out.println("Parallelogram Area: " + parallelogramArea);
        System.out.println("Parallelogram Perimeter: " + parallelogramPerimeter);

        // Close the Scanner
        scanner.close();
    }
}