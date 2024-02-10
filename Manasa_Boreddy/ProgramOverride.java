class ProgramOverride
{
    public int calci(int a, int b)
    {
        return a+b;
    }
}
class rectangle extends ProgramOverride
{
    public int calci(int a, int b)
    {
        return 2*(a+b);
    }
}