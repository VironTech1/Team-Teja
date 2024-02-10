package Assignment5;

public class ThreeMobile {

    double balance=0;

    public void recharge(int amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Recharge successful & Current balance in Rupees is : " + balance);
        } else {
            System.out.println("Make sure the recharge amount is greater than 0.");
        }
    }

    public void makingCalls(double costPerMinute ,double noOfMin){
        double costPerCall = costPerMinute * noOfMin;
        if (costPerCall <= balance && noOfMin > 0) {
            balance -= costPerCall;
            System.out.println("Call successful & Remaining balance in Rupees : " + balance);
        } else if (noOfMin <= 0) {
            System.out.println("Call duration is 0 minutes, Cannot calculate");
        } else {
            System.out.println("Insufficient balance to make the call, Please Recharge your number");
        }
    }

    public static void main(String[] args) {

        ThreeMobile mobile= new ThreeMobile();
        mobile.recharge(50);
        mobile.makingCalls(0.50,10);

    }
}
