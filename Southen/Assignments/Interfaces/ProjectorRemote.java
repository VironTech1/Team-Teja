package com.southen.interfaces.problems;

public class ProjectorRemote implements Remote {
    int brightness;
    boolean isOn;

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Projector is turned on");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("Projector is turned off");
    }

    public void increaseBrightness(int brightnessIncrease) {
        if (brightness < 100) {
            brightness += brightnessIncrease;
            System.out.println("The brightness of the projector is increased to " + brightness);
        } else {
            System.out.println("Maximum brightness reached");
        }
    }

    public void decreaseBrightness(int brightnessDecrease) {
        if (brightness > 0) {
            brightness -= brightnessDecrease;
            System.out.println("The brightness of the projector is decreased to " + brightness);
        } else {
            System.out.println("Minimum brightness reached");
        }
    }
}
