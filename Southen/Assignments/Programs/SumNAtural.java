package programs.southen.com;

public class SumNAtural {
    public static void main(String[] args) {
        System.out.println("The sum of first  10 natural numbers are:");
        int sum = 0; 
        for(int i =1; i<= 10; i++){
            sum += i;
            System.out.print(sum + " ");
        }
    }
}

