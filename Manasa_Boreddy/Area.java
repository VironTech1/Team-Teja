import java.util.Scanner;

public class Area
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);
        //Area and perimeter of circle
        double p = Math.PI;
        System.out.println("Give the radius of circle r: ");
        int r = scan.nextInt();
        double ar = p*r*r;
        int cr = r*r;
        System.out.println("Area of circle: " + ar);
        System.out.println("Perimeter of circle: " +cr);
        //area and perimeter of square
        System.out.println("Give the area of square b: ");
        int b = scan.nextInt();
        int as = b*b;
        int cs = b+b;
        System.out.println("Area of square: " + as);
        System.out.println("Perimeter of square: " +cs);
        //area and perimeter of rectangle
        System.out.println("Given the length of rectangle l: ");
        System.out.println("Given the breadth of rectangle h: ");
        int l = scan.nextInt();
        int h = scan.nextInt();
        int are = l*h;
        int cre = 2*(l+h);
        System.out.println("Area of rectangle: " + are);
        System.out.println("Perimeter of rectangle: " +cre);
        //area and perimeter of a parallelogram
        System.out.println("Given the length of parallelogram ap: ");
        System.out.println("Given the breadth of parallelogram bp: ");
        System.out.println("Given the length of parallelogram cp: ");
        System.out.println("Given the breadth of parallelogram dp: ");
        int ap = scan.nextInt();
        int bp = scan.nextInt();
        int cp = scan.nextInt();
        int dp = scan.nextInt();
        int apa = bp*dp;
        int cpa = ap+bp+cp+dp;
        System.out.println("Area of parallelogram: " + apa);
        System.out.println("Perimeter of parallelogram: " +cpa);
    }
}