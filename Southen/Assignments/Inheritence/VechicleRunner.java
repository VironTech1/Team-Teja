

public class VechicleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car car = new Car();
		
		car.name = "Toyota";
		car.model = "Camry";
		car.year = 2022;
		
		car.carGears();
		car.drive();
		
		
		System.out.print("the sound of the car is : ");
		car.hornSound();
		
		System.out.println("the name of the car is : " + car.name);
		
		
		Auto auto = new Auto();
		
		auto.name = "bajaj";
		auto.make = "ace";
		auto.year = 2023;
		
		System.out.println("the auto is built in the year : " + auto.year);
		
		auto.drive();
		auto.hornSound();
		
		
		
		
	}

}
