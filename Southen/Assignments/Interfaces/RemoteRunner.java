package com.southen.interfaces.problems;

public class RemoteRunner {
    public static void main(String[] args) {
        
    	
        TvRemote tvRemote = new TvRemote();
        tvRemote.powerOn();
        tvRemote.increaseVolume(5);
        tvRemote.increaseChannel(2);
        tvRemote.decreaseVolume(3);
        tvRemote.decreaseChannel(1);
        tvRemote.powerOff();

       
        
        AcRemote acRemote = new AcRemote();
        acRemote.powerOn();
        acRemote.increaseTemp(2);
        acRemote.decreaseTemp(1);
        acRemote.powerOff();

        
        
        ProjectorRemote projectorRemote = new ProjectorRemote();
        projectorRemote.powerOn();
        projectorRemote.increaseBrightness(20);
        projectorRemote.decreaseBrightness(10);
        projectorRemote.powerOff();
    }
}

