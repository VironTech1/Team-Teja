package inheritence;

public class Tester extends Employee {

	int noofTestCases;
	
	Tester(String empName, int empId, double salary, String role,int noofTestCases) {
		super(empName, empId, salary, role);
		this.noofTestCases = noofTestCases;
	}
	
	void empWork() {
		System.out.println("Tester do the task of testing\nHe has tested "+noofTestCases+" test cases");
	}
	

}
