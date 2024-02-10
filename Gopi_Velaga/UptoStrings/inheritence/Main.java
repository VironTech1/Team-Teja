package inheritence;

public class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Gnaneshwar", 1234, 100000, "System Engineer");
		emp.getDetails();
		emp.empWork();		
		
		Developer dev = new Developer("Gopi Chand Velaga", 1235, 100000, "Developer",1000);
		dev.getDetails();
		dev.empWork();
		dev.print();
		
		Tester test =  new Tester("Lakshmi Reddy", 1236, 100000, "Tester",50);
		test.getDetails();
		test.empWork();
		
		Employee emp1 = new Developer("Gopi", 1237, 100000, "Developer",1000);
		emp1.getDetails();
		emp1.empWork();
		/*Compiler time error.
		Even the Employee reference variable points to the Developer object, the compiler doesn't know during the 
		compilation because the object creation is done during the runtime.
		So the parent class reference variable will only call the methods in the parent class(it means the
		common methods also). Even we have the chance we can't call the methods of the child class.
		 */
		//emp1.print();
		
		//Three level inheritance
		
		Vehicle veh = new Vehicle();
		veh.accelerate();
		
		Car car = new Car();
		car.accelerate();
		
		Ferrari fe = new Ferrari();
		fe.accelerate();
		
		Vehicle veh1 = car;
		veh1.accelerate();
		
		Vehicle veh2 = fe;
		veh2.accelerate();
		
		Car car2 = fe;
		car2.accelerate();
		
	}

}
