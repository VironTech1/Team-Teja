// Mobile.java
public class Mobile {
    private String battery;
    private String sim;
    private String screen;

    public Mobile(String battery, String sim, String screen) {
        this.battery = battery;
        this.sim = sim;
        this.screen = screen;
    }

    // Getter and setter methods for Mobile attributes

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }
}
