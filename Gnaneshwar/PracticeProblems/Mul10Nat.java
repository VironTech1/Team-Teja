 public class MultiplicationTables {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication table for " + i + ":");

            // Print the multiplication table for the current number
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }

            // Add a line break between tables
            System.out.println();
        }
    }
}

           