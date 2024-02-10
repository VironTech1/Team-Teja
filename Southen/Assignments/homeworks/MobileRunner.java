// Mobile has balance and it can be changed by recharging and making calls.
package com.southen.homeworks;

class Mobile {
	String make;
	String model;
	int year;
	double balance;
	
	public void recharge(double topup) {
		if(balance< 0) {
			balance += topup;
			System.out.println("the updated mobile balance is:  " + balance);
		}
	}
}

public class MobileRunner {

	public static void main(String[] args) {
	
		
		Mobile mobile = new Mobile();
		
		mobile.balance = 40.56;
		mobile.recharge(10);
		

	}

}
