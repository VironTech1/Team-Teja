class ArmstrongNumber{
     public static void main(String args[])
     {
        int n=153; 
        int sum = 0;
         int temp = n;
         while(temp!= 0)
         {
             int rem = temp % 10;
             sum += rem * rem * rem;
             temp = temp / 10;
         }
         if(sum == n)
             System.out.println(n + " is an Armstrong number");
         else
             System.out.println(n + " is not Armstrong number");
     }
}
