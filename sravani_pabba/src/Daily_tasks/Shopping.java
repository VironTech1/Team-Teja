package Daily_tasks;

public class Shopping {
	
	public void types() {
		System.out.println("Online and offline");
	}
		public void tools() {
			System.out.println("Many tools are needed");
		}
	}




class Appliances extends Shopping{
	
	void kitchen() {
		System.out.println("Oven");
	}
	
	void Home() {
		System.out.println("Air Conditioner");
	}
}

class Interior extends Shopping{
	
	void Chandilier() {
		System.out.println("Crytal Chandilier");
	}
		//@Override
		public void tools() {
			
	      System.out.println("tools are not needed");
		}
	}



