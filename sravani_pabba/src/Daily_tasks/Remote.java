package Daily_tasks;

public interface Remote {
    void on();
    void off();
}


class TvRemote implements Remote {
    private int channel;
    private int volume;
    
    public void on() {
        System.out.println("TV Remote: Turning on");
    }
    
    public void off() {
        System.out.println("TV Remote: Turning off");
    }
    
    public void increaseChannel() {
        channel++;
        System.out.println("TV Remote: Increasing channel to " + channel);
    }
    
    public void decreaseChannel() {
        channel--;
        System.out.println("TV Remote: Decreasing channel to " + channel);
    }
    
    public void increaseVolume() {
        volume++;
        System.out.println("TV Remote: Increasing volume to " + volume);
    }
    
    public void decreaseVolume() {
        volume--;
        System.out.println("TV Remote: Decreasing volume to " + volume);
    }
}


class AcRemote implements Remote {
    private int temperature;
    private String mode;
    
    public void on() {
        System.out.println("AC Remote: Turning on");
    }
    
    public void off() {
        System.out.println("AC Remote: Turning off");
    }
    
    public void increaseTemperature() {
        temperature++;
        System.out.println("AC Remote: Increasing temperature to " + temperature);
    }
    
    public void decreaseTemperature() {
        temperature--;
        System.out.println("AC Remote: Decreasing temperature to " + temperature);
    }
    
    public void changeMode(String newMode) {
        mode = newMode;
        System.out.println("AC Remote: Changing mode to " + mode);
    }
}


class ProjectorRemote implements Remote {
    private int brightness;
    
    public void on() {
        System.out.println("Projector Remote: Turning on");
    }
    
    public void off() {
        System.out.println("Projector Remote: Turning off");
    }
    
    public void increaseBrightness() {
        brightness++;
        System.out.println("Projector Remote: Increasing brightness to " + brightness);
    }
    
    public void decreaseBrightness() {
        brightness--;
        System.out.println("Projector Remote: Decreasing brightness to " + brightness);
    }
}

public class Main {
    public static void main(String[] args) {
        
        TvRemote tvRemote = new TvRemote();
        tvRemote.on();
        tvRemote.increaseChannel();
        tvRemote.increaseVolume();
        tvRemote.decreaseVolume();
        tvRemote.off();
        
        System.out.println();
        
        
        AcRemote acRemote = new AcRemote();
        acRemote.on();
        acRemote.increaseTemperature();
        acRemote.changeMode("Cool");
        acRemote.off();
        
        System.out.println();
        
       
        ProjectorRemote projectorRemote = new ProjectorRemote();
        projectorRemote.on();
        projectorRemote.increaseBrightness();
        projectorRemote.off();
    }
}