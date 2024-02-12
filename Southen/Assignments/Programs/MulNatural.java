package programs.southen.com;

public class MulNatural {
    public static void main(String[] args) {
        System.out.println("The multiplication of first  10 natural numbers are:");
        int mul = 1; 
        for(int i =1; i<= 10; i++){
            mul *= i;
            System.out.print(mul + " ");
        }
    }
}

