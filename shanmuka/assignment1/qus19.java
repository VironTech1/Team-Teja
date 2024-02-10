import java.util.Scanner;
//19. Write a program to calculate current bill based on units(Units : 1-100 - 3rs, 101- 200- 4rs, 201 -300- 5 rs, 301 and above 6 rs) ?

public class qus19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter consumed units: ");
        int consumedUnits = scanner.nextInt();

        double billAmount = 0;

        if (consumedUnits >= 1 && consumedUnits <= 100) {
            billAmount = consumedUnits * 3;
        } else if (consumedUnits >= 101 && consumedUnits <= 200) {
            billAmount = 100 * 3 + (consumedUnits - 100) * 4;
        } else if (consumedUnits >= 201 && consumedUnits <= 300) {
            billAmount = 100 * 3 + 100 * 4 + (consumedUnits - 200) * 5;
        } else if (consumedUnits > 300) {
            billAmount = 100 * 3 + 100 * 4 + 100 * 5 + (consumedUnits - 300) * 6;
        }

        System.out.println("Current Bill Amount: Rs." + billAmount);

    }
}
