public class MethodOverloadingTest{
    public static void callMe(int i)
    {
        System.out.println("Primitive Integer ");
    }
    public static void callMe(Integer i)
    {   
      System.out.println("Primitive Integer Object");  
    }
    public static void callMe(double i)
    {   
      System.out.println("Primitive Double");  
    }
    public static void main(String[] args)
    {   
      callMe(10);
    }
}