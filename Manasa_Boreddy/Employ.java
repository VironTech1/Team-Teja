public class Employ
{
    int employId;
    String name;
    double salary;
    public void registerAttendance()
    {
        System.out.println("Attendance registered");
    }
    public void applyLeave()
    {
        System.out.println("Apply leave");
    }
    
}

public class Developer extends Employ
{
    int noOfLines;
    int noOfMethods;
    int noOfClasses;
    public void writecode()
    {
        System.out.println("Developer writes code");
    }
    public void integratecode()
    {
        System.out.println("integrates code");
    }
}