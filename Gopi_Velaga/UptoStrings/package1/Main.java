package package1;

public class Main {
	

	public static void main(String[] args) {
		
		Overload_Concept obj = new Overload_Concept();
		obj.print("Gopi Chand Velaga");
		obj.print(594);
		obj.print("Gopi Chand Velaga",594);
		
		//Access Modifier variable testing
		//obj.a = 10;//Getting an error as it is private variable so using set method
		obj.setA(10);
		obj.b = 15;
		obj.c = 20;
		obj.d = 25;		
		//Printing variables
		System.out.println("Private value variable:"+obj.getA());
		System.out.println("Public value variable:"+obj.b);
		System.out.println("Protected value variable:"+obj.c);
		System.out.println("Default access modifier value variable:"+obj.d);
		
		/*
		
		//Object for Meeting
		Meeting meet1 = new Meeting();
		//Object for participant
		Participant par1 = new Participant();
		par1.createParticipant("Gopi Chand Velaga", 85046400, "Guntur");
		meet1.createMeeting("dfghjkl.dfghjk", 10.00, "Tainer", par1);
		
		//Object for Mobile
		Mobile mob = new Mobile("Samsung","verizon","Curved");
		mob.getDetails();
		
		//Object for employee
		Employee emp1 = new Employee();
		Project proj1 = new Project(1234,"TCS");
		emp1.createEmployee("Gopi", 1234, 100000, proj1);*/
		
	}

}
