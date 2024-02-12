package stringex;

public class MethodOverlaodingTest {

    public void callMe(int i){
        System.out.println("Primitive Integer ");
    }

    public void callMe(Integer i){
        System.out.println("Primitive Integer object");
    }


    public void callMe(double i){
        System.out.println("Primitive Double");
    }

    public 




    public static void main(String[] args) {
        MethodOverlaodingTest obj = new MethodOverlaodingTest();
        obj.callMe(10); 
       
        
    }
    
}
