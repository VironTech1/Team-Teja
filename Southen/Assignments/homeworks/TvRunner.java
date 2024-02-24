// Tv has channel and volume and they can be changed by inc/dec volume & channel.
package com.southen.homeworks;


class Tv{
	
	
	int channel;
	int volume;
	
	
	public void increaseVolume(int soundIncrease) {
		
		if (volume < 30) {
			 volume += soundIncrease;
			 System.out.println("the volume of tv is increased to " + volume);
		}else {
			System.out.println("maximum volume reached");
		}
		
	}
	
	
	public void decreaseVolume(int soundDecrease) {
		
		if (volume > 0) {
			 volume -= soundDecrease;
			 System.out.println("the volume of tv is increased to " + volume);
		}else {
			System.out.println(" volume muted");
		}
		
	}
}



public class TvRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Tv tv = new Tv();
		
		tv.volume = 23;
		
		tv.increaseVolume(10);
		
		tv.decreaseVolume(30);
		

	}

}
