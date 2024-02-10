package VironTecBank;

/*Create
get Deatils
With draw
Deposit
balance
 */
public class Account {

    //creating variables:
    long accountNumber;
    String accountName;
    double accountBalance;
    String accountAddress;
    long accountPhoneNumber;

    void getAccountDetails() {
        System.out.println(accountNumber);
        System.out.println(accountName);
        System.out.println(accountBalance);
        System.out.println(accountAddress);
        System.out.println(accountPhoneNumber);
    }
    void withdraw()
    {
        accountBalance=accountBalance-5000;
    }
    void deposit(){
        accountBalance=accountBalance+8000;
    }
    void createAccount(){

    }


}
