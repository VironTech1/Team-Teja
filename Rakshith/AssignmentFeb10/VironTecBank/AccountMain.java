package VironTecBank;

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account();


        account1.accountNumber = 12345667l;
        account1.accountName = "Customer1";
        account1.accountBalance = 10000;
        account1.accountPhoneNumber = 9123456600l;
        account1.accountAddress = "Texas";
        System.out.println("Account1 Details::*******");
        account1.getAccountDetails  ();
       /* System.out.println(account1.accountNumber);
        System.out.println(account1.accountName);
        System.out.println(account1.accountBalance);
        System.out.println(account1.accountPhoneNumber);
        System.out.println(account1.accountAddress);*/

        Account account2 = new Account();
        account2.accountNumber = 23455556;
        account2.accountName = "Customer2";
        account2.accountBalance = 12000;
        account2.accountPhoneNumber = 81265353;
        account2.accountAddress = "kentucky";
        System.out.println("Account2 Details::*******");
        account2.getAccountDetails();
        /*System.out.println(account2.accountNumber);
        System.out.println(account2.accountName);
        System.out.println(account2.accountBalance);
        System.out.println(account2.accountPhoneNumber);
        System.out.println(account2.accountAddress);*/

        Account account3 = new Account();

        account3.accountNumber = 9886776;
        account3.accountName = "Customer3";
        account3.accountBalance = 20000;
        account3.accountPhoneNumber = 799654323;
        account3.accountAddress = "Kansas";
        System.out.println("Account3 Details::*******");
        account3.getAccountDetails();
        /*System.out.println(account3.accountNumber);
        System.out.println(account3.accountName);
        System.out.println(account3.accountBalance);
        System.out.println(account3.accountPhoneNumber);
        System.out.println(account3.accountAddress);
*/

        /*Account account4 = account3;
        account4= new Account();*/

        System.out.println("Before Withdrawing of Account1*****...");
        System.out.println(account1.accountBalance);
        account1.accountBalance = account1.accountBalance - 5000;
        System.out.println("After Withdrawing of Account1*****..." + "balance is" + "=" + account1.accountBalance);
        System.out.println();

        System.out.println("Before Withdrawing of Account2*****...");
        System.out.println(account2.accountBalance);
        account2.accountBalance = account2.accountBalance - 2000;
        System.out.println("After Withdrawing of Account2*****......"+"balance is" +"= " + account2.accountBalance);
        System.out.println();

        System.out.println("Before Withdrawing of Account3*****.....");
        System.out.println(account3.accountBalance);
        account3.accountBalance = account3.accountBalance - 8000;
        System.out.println("After Withdrawing of Account3*****..... " + account3.accountBalance);
        System.out.println();

        System.out.println("Before Deposit of Account1*****.....");
        System.out.println(account1.accountBalance);
        account1.accountBalance = account1.accountBalance + 10000;
        System.out.println("After Deposit of Account1*****..... " + account1.accountBalance);
        System.out.println();

        System.out.println("Before Deposit of Account2*****.....");
        System.out.println(account2.accountBalance);
        account2.accountBalance = account2.accountBalance + 20000;
        System.out.println("After Deposit of Account2*****..... " + account2.accountBalance);
        System.out.println();

        System.out.println("Before Deposit of Account3*****.....");
        System.out.println(account3.accountBalance);
        account3.accountBalance = account3.accountBalance + 4000;
        System.out.println("After Deposit of Account3*****..... " + account3.accountBalance);


    }
}
