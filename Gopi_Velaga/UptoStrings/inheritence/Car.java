package inheritence;

public class Car extends Vehicle {
	@Override
	void accelerate() {
		System.out.println("\nThe Car will accelerate with more than 50mph of speed");
	}
}
