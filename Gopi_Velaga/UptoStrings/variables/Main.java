package variables;

import package1.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		System.out.println(a);
		System.out.println(Sample.b);
		
		//Preferred way to call the static variable and methods
		Sample.b = 20;
		Sample.method();
		
		/*
		obj.b = 15;
		obj.method();
		
		 * Calling the static methods with the help of the objects is working, but it is not recommended to 
		 * use the static variables or the methods with the help of the objects.
		 * */
		
		Sample obj = new Sample(10,"Gopi");	
		
		Employee emp = new Employee();
		
		System.out.println(emp.hashCode());
		
		
		
	}

	
}
