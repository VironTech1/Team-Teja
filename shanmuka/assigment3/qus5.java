package assigment3;
//5. Java Program to print 1-10 mathematical tables

public class qus5 {
    public static void main(String[] args) {
        for(int n=1;n<=10;n++)
        {
            System.out.println("Table " + n + ":");
            tableFunction(n);
            System.out.println();
        }
    }

    public static void tableFunction(int mul) {
        for(int i=1;i<=10;i++)
        {
            System.out.println(mul + " x " + i + " = "+(mul * i));
        }
        
    }

    
}
