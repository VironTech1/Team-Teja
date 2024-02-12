package programs.southen.com;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("5 mathematical table is :");
        int number = 5; 
        for(int i =1; i<= 10; i++){
            int result = number * i;
            System.out.println( number + " X " + i + " = " + result);
        }
    }
}

