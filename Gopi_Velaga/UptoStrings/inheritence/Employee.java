package inheritence;

public class Employee {
	String empName;
	int empId;
	double salary;
	String role;
	
	Employee(String empName,int empId,double salary,String role){
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
		this.role = role;
	}
	
	void getDetails() {
		System.out.println("\nEmployee Details");
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee Role: "+role);
	}
	
	void empWork() {
		System.out.println("Employee do the tasks");
	}
	
}
