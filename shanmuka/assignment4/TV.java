package assignment4;

class TV {
    private int channel;
    private int volume;

    public TV() {
        this.channel = 1;
        this.volume = 50;
    }

    public void increaseChannel() {
        channel++;
        System.out.println("Channel increased to: " + channel);
    }

    public void decreaseChannel() {
        if (channel > 1) {
            channel--;
            System.out.println("Channel decreased to: " + channel);
        } else {
            System.out.println("Cannot decrease channel. Already on the first channel.");
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume increased to: " + volume);
        } else {
            System.out.println("Volume is already at maximum.");
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume decreased to: " + volume);
        } else {
            System.out.println("Volume is already at minimum.");
        }
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }
}






/*
1. Car has speed and it can be changed by acceleration and applying break.
2. Tv has channel and volume and they can be changed by inc/dec volume & channel.
3. Mobile has balance and it can be changed by recharging and making calls.
4. Water bottle has capacity and water level.
   Water level can be changed by filling, sipping and emptying.
Make sure that water level can't cross bottle capacity when filling and it should be reduced by sipping and emptying. Check all conditions and write program.
5. Calculator can perform various calculations ex add, sub,start, and all other calculations for conversions like weight, distance etc.. 
 Create a program with all operations and return values
6. Driver drives the car and car moves.
*/