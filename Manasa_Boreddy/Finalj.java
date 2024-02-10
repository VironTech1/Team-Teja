class Calc
{
    public void show()
    {
        System.out.println("in A show");
    }
}
class Advcalc extends Calc
{
    public void show()
    {
        System.out.println("in B show");
    }
}
public class Finalj
{
    public static void main(String[] args)
    {
        Advcalc obj = new Advcalc();
        obj.show();
    }
}