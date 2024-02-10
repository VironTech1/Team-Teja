package package1;

public class Employee {
	String name;
	long id;
	double salary;
	Project project;
	
	void createEmployee(String name,long id,double salary,	Project project) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.project = project;
		
	}
}
