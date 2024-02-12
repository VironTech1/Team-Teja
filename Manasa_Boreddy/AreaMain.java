import java.util.Scanner;
public class AreaMain
{
    public static void main(String[] args)
    {
        Scanner areamain = new Scanner(System.in);
        System.out.println("Enter values of a and b: ");
        int a = areamain.nextInt();
        int b = areamain.nextInt();
        System.out.println("Enter values of r: ");
        int r = areamain.nextInt();
        System.out.println("Enter values of s: ");
        int s = areamain.nextInt();
        Method obj = new Method();
        System.out.println("Area of rectangle: " +obj.area(a, b));
        System.out.println("Area of circle: " +obj.area(r));
        System.out.println("Area of square: " +obj.area(s));
    }
}