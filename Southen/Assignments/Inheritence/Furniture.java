


// Create 3 levels of inheritance and call the methods



public class Furniture {
	
	void move() {
		System.out.println("the  furniture can move");
	}
}

class Chair extends Furniture {
	
	void sit() {
		System.out.println("we can sit on chair");
	}
}

class OfficeChair extends Chair {
	
	 void adjustHeight() {
		 System.out.println("we can adjust the seating heights by the lever");
	 }
}





