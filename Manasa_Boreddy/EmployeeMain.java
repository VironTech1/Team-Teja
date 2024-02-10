import java.util.Scanner;
public class EmployeeMain
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of the employee: ");
        String name = scan.nextLine();
        System.out.println("Enter Id of the employee: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter project of the employee: ");
        String project = scan.nextLine();
        System.out.println("Enter salary of the employee: ");
        double salary = scan.nextDouble();
        Employee emp = new Employee();
        emp.detail(name, id);
        emp.detail(name, id, project);
        emp.detail(name, id, salary);
        // emp.detail("Manasa", 110);
        //emp.detail("Manasa", 110, "SoftwareDesigning");
        //emp.detail("Manasa", 110, 1000000);
    }
}