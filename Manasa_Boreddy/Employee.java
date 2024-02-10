public class Employee
{
    public void detail(String name, int id)
    {
        System.out.println("name of the employee: " +name);
        System.out.println("Id of the employee: " +id);
    }
    public void detail(String name, int id, String project)
    {
        System.out.println("name of the employee: " +name);
        System.out.println("Id of the employee: " +id);
        System.out.println("project of the employee: " +project);
    }
    public void detail(String name, int id, double salary)
    {
        detail(name, id);
        // System.out.println("name of the employee: " +name);
        // System.out.println("Id of the employee: " +id);
        System.out.println("salary of the employee: " +salary);
    }
}