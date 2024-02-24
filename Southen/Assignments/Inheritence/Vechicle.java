

//Create inheritance and perform overriding.



public class Vechicle {
	
	
	String name;
	
	
	
	void hornSound() {
		System.out.println(" vehicle has horn sounds");
	}
	

	void  drive() {
		System.out.println("we can drive all vechicles");
	}

}

class Car extends Vechicle{
	
	String name;
	String model;
	int year;
	
	
	void carGears() {
		System.out.println("the car has five gears");
	}
	
	void  drive() {
		System.out.println("we can drive the car using steering");
	}
	
	void hornSound() {
		System.out.println("honk honk");
	}
	
	
}

class Auto extends Vechicle{
	
	
	String name;
	String make;
	int year;
	
	void  drive() {
		System.out.println("we can drive the Auto using handle");
	}
	
	void hornSound() {
		System.out.println("pow pow");
	}
	
}


