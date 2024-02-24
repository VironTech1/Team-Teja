package Assignment4;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp= new Employee();
        emp.eId=1234;
        emp.eName="Nihal";
        emp.eSalary=123000;

        System.out.println("Employee Details*************");
        emp.empDetails();
        System.out.println();

        Project project= new Project();
        project.projectId="Proj1234";
        project.clientName="HP";
        System.out.println("project Details**********");
        project.projectDetails();
    }
}
