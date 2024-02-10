package com.southen.interfaces.problems;

public interface Remote {
    void powerOn();
    void powerOff();
}

class TvRemote implements Remote {
    int channel;
    int volume;
    boolean isOn;

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("TV is turned on");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("TV is turned off");
    }

    public void increaseVolume(int soundIncrease) {
        if (volume < 30) {
            volume += soundIncrease;
            System.out.println("The volume of TV is increased to " + volume);
        } else {
            System.out.println("Maximum volume reached");
        }
    }

    public void decreaseVolume(int soundDecrease) {
        if (volume > 0) {
            volume -= soundDecrease;
            System.out.println("The volume of TV is decreased to " + volume);
        } else {
            System.out.println("Volume muted");
        }
    }

    public void increaseChannel(int changed) {
        
        System.out.println("The channel of TV is changed to " + changed);
    }

    public void decreaseChannel(int channelDecrease) {
        if (channel > 0) {
            channel -= channelDecrease;
            System.out.println("The channel of TV is decreased to " + channel);
        } else {
            System.out.println("Channel cannot be decreased further");
        }
    }
}




