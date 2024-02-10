package inheritence;

public class Developer extends Employee {

	int noofLines;
	
	Developer(String empName, int empId, double salary, String role,int noofLines) {
		super(empName, empId, salary, role);
		this.noofLines = noofLines;
	}
	@Override
	void empWork() {
		System.out.println("Developer do the task of development\nHe has developed "+noofLines+" lines of code..");
	}

	void print() {
		System.out.println("Print");
	}
}
