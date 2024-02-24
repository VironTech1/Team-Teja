package Assignment3;

public class NaturalNum123 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(" " + i);
        }
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of above numbers :: "+ sum );

        for (int i = 1; i <= 10; i++) {
            sum = sum * i;
        }
        System.out.println("Multiplication of above numbers :: "+ sum );

    }
}
