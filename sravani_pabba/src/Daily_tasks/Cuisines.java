package Daily_tasks;

public class Cuisines {
	
	public void types() {
		System.out.println("There are various types of cuisines");
	}
		
		public void recipes() {
		System.out.println("There are different recipes for different cuisines");
		}
			
}
		
class Italian extends Cuisines {
	
	void Ingridients() {
		 
		 System.out.println("cheese");
	 }
	
}


class Northern extends Cuisines {
	
	void Ingridients() {
		 
		 System.out.println("paneer");
	 }
}
	

class Southern extends Cuisines {
	
	void Ingridients() {
		 
		 System.out.println("Chicken");
	 }
	
}

class Pasta extends Italian {
	
	void Varieties () {
		System.out.println("Alfredo");
	}
}

