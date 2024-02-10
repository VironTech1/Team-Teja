package com.southen.interfaces.problems;

public class AcRemote implements Remote {
    int temp;
    boolean isOn;

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("AC is turned on");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("AC is turned off");
    }

    public void increaseTemp(int tempIncrease) {
        if (temp < 28) {
            temp += tempIncrease;
            System.out.println("The temperature of AC is increased to " + temp);
        } else {
            System.out.println("Maximum temperature reached");
        }
    }

    public void decreaseTemp(int tempDecrease) {
        if (temp > 16) {
            temp -= tempDecrease;
            System.out.println("The temperature of AC is decreased to " + temp);
        } else {
            System.out.println("Minimum temperature reached");
        }
    }
}
