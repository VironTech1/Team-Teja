// Define the Employee interface
interface Employeeinter {
    String getName();
    
    String getType();
    
    double calculateSalary();
    
    // Abstract method to display details of the employee
    void displayDetails();
}

// Implement the interface in a class for a specific type of employee
class FullTimeEmployee implements Employeeinter {
    private String name;
    private double salary;

    // Constructor
    public FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Implementing the getName method from the interface
    @Override
    public String getName() {
        return name;
    }
    
    // Implementing the getType method from the interface
    @Override
    public String getType() {
        return "Full-Time";
    }

    // Implementing the calculateSalary method from the interface
    @Override
    public double calculateSalary() {
        return salary;
    }

    // Implementing the displayDetails method from the interface
    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + getType());
        System.out.println("Salary: $" + calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of FullTimeEmployee
        FullTimeEmployee employee = new FullTimeEmployee("John Doe", 50000);
        
        // Display employee details
        employee.displayDetails();
    }
}
