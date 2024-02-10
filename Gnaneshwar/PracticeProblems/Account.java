class Account
{
 String name;
 long number;
 double balance;

void createAccount(String n, long l, double b)
{
  name = n;
  number = l;
  balance =b;
}

void getDetails()
{
  System.out.println(name);
  System.out.println(number);
  System.out.println(balance);
}


}
