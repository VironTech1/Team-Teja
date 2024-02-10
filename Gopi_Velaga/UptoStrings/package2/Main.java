package package2;

import package1.Overload_Concept;

public class Main {

	public static void main(String[] args) {
		
		//Account acc1 = new Account("Gopi Chand Velaga", 12345677, 10000);
		
		System.out.println("Hello\nJava");  // Prints "Hello" on one line and "Java" on the next line
		System.out.println("Hello\rWorld"); // Overwrites "Hello" with "World", resulting in "World"
		
		
		Overload_Concept obj = new Overload_Concept();
		obj.print("Gopi Chand Velaga");
		obj.print(594);
		obj.print("Gopi Chand Velaga",594);
		
		//Access Modifier variable testing
		//obj.a = 10;//Getting an error as it is private variable so using set method
		obj.setA(10);
		obj.b = 15;
		//obj.c = 20;//Getting an error as it is protected variable in another package so using set method
		obj.setC(20);
		//obj.d = 25;//Getting an error as it is default variable in another package so using set method
		obj.setD(25);
		
		//Printing variables
		System.out.println("Private value variable:"+obj.getA());
		System.out.println("Public value variable:"+obj.b);
		System.out.println("Protected value variable:"+obj.getC());
		System.out.println("Defalut modifier value variable:"+obj.getD());
		
		
		/*
		Account acc1 = new Account();
		acc1.createAccount("Gopi Chand Velaga", 12345677, 10000);
		acc1.getDetails();
		acc1.checkBalance();
		acc1.deposit(1000);
		acc1.withdraw(1200);
		
		//Account acc2 = new Account("Gnaneshwar Reddy Solpuram", 15879864, 10000);
		Account acc2 = new Account();
		acc2.createAccount("Gnaneshwar Reddy Solpuram", 15879864, 10000);
		acc2.getDetails();
		acc2.checkBalance();
		acc2.deposit(9000);
		acc2.withdraw(35000);*/
		

	}

}
