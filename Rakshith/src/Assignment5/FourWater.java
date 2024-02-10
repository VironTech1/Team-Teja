package Assignment5;

public class FourWater {

    double capacity=50;
    double waterLevel=0.0;

    public void fill(double amount) {
        if (amount > 0) {
           double totalAmount= waterLevel+amount;
            if (totalAmount <= capacity) {
                waterLevel += amount;
                System.out.println("Current water level after filling in lts " + waterLevel );
            } else {
                System.out.println("Water level exceeds the capacity , cannot fill it.");
            }
        } else {
            System.out.println("Amount to be filled should be grater than zero ");
        }
    }

    public void sip(double amount) {
        if (amount > 0) {
            if (waterLevel >= amount) {
                waterLevel = waterLevel-amount;
                System.out.println("Current water level after Sipping in lts " + waterLevel );
            } else {
                System.out.println("Water Insufficient , cannot Sip");
            }
        } else {
            System.out.println("Amount to Sip must be greater than 0");
        }
    }
    public void empty() {
        waterLevel = 0.0;
        System.out.println("Current water level after emptying in lts:  " + waterLevel );
    }
    public static void main(String[] args) {
        FourWater myBottle = new FourWater();

        myBottle.fill(1.0);
        myBottle.sip(0.5);
        myBottle.empty();
        myBottle.sip(0.5);  // Trying to sip when the bottle is empty

    }


}
