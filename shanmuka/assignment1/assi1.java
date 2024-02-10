//package assignment1;
public class assi1 {
    public static void main(String[] args) {
        Mobile myMobile = new Mobile("5000 mAh", "Nano SIM", "6.2 inches");

        // Get mobile details
        System.out.println("Battery: " + myMobile.getBattery());
        System.out.println("SIM: " + myMobile.getSim());
        System.out.println("Screen: " + myMobile.getScreen());

        // Update mobile details
        myMobile.setBattery("6000 mAh");
        myMobile.setSim("Micro SIM");
        myMobile.setScreen("6.5 inches");

        // Get updated details
        System.out.println("\nUpdated Details:");
        System.out.println("Battery: " + myMobile.getBattery());
        System.out.println("SIM: " + myMobile.getSim());
        System.out.println("Screen: " + myMobile.getScreen());
    }
}
