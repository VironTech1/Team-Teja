package Assignment5;

public class TwoTv {

    int channel=10;
    int volume=30;

    public void increaseChannel(){
        channel= channel+1;
        System.out.println("Channel increased by 1, so the new Channel is : "+channel);
    }
    public void decreaseChannel() {
        if (channel > 1) {
            channel=channel-1;
            System.out.println("Channel decreased by 1, so now the Channel is : " + channel);
        } else {
            System.out.println("Cannot decrease channel because it is already in Channel 1.");
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume=volume+1;
            System.out.println("Volume increased by 1, so new volume is  :" + volume);
        } else {
            System.out.println("Volume is at maximum level  i.e 100.");
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume= volume-1;
            System.out.println("Volume decreased by 1, so the new volume is : " + volume);
        } else {
            System.out.println("Volume is already at the minimum level i.e 0.");
        }
    }

    public static void main(String[] args) {
        TwoTv tv= new TwoTv();
        tv.increaseChannel();
        tv.increaseVolume();
        tv.decreaseChannel();
        tv.decreaseVolume();


    }

}
