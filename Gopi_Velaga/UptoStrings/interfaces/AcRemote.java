package interfaces;

public class AcRemote implements Remote{

	@Override
	public void on() {
		System.out.println("Starts the AC");
		
	}
	
	@Override
	public void off() {
		System.out.println("Turn off the AC");
	}
	
	public void increaseTemp() {
		System.out.println("Increse the temperature");
	}
	
	public void decreaseTemp() {
		System.out.println("Decrease the temperature");
	}
	
}
