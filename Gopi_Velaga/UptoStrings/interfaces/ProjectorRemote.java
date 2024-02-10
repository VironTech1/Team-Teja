package interfaces;

public class ProjectorRemote implements Remote {

	@Override
	public void on() {
		System.out.println("Switch on the projector");
	}

	@Override
	public void off() {
		System.out.println("Switch off the projector");
	}
	
	public void incrementSize() {
		System.out.println("Increase the size of screen");
	}
	
	public void deccrementSize() {
		System.out.println("Reduce the size of screen");
	}

}
