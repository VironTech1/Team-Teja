class First10Nat{
   
    public static void main(String[] args) {
        int n =10;
        int result;
    for (int i = 1; i <= n; i++) 
    {
        for(int j=1; j<=i; j++)
        {
            result=i*j;
        }
            System.out.println(result);
        }
        
    }
}
