package interfaces;

public class TvRemote implements Remote {

	@Override
	public void on() {
		System.out.println("Switch on the TV");		
	}

	@Override
	public void off() {
		System.out.println("Switch off the TV");
	}
	
	public void incrementVolume() {
		System.out.println("Increment the volume");
	}
	
	public void decrementVolume() {
		System.out.println("Decrement the volume");
	}

}
