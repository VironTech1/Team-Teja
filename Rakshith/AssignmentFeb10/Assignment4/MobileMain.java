package Assignment4;

public class MobileMain {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();
        mobile.battery = "5000 mah";
        mobile.mName = "Samsung";
        mobile.screen = "6.5 inch";
        mobile.sim = "T-mobile";

        System.out.println("Mobile Details**********");
        mobile.mobileDetails();

    }


}
