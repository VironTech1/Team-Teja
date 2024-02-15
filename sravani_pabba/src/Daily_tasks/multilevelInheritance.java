package Daily_tasks;

public class multilevelInheritance {
	
	
		public static void main(String[] args) {
			
			Italian i = new Italian();
			i.types();
			i.Ingridients();
			
			Northern n = new Northern();
			n.recipes();
			n.Ingridients();
			
			Southern s = new Southern();
			s.Ingridients();
			
			Pasta p = new Pasta();
			
			p.Varieties();
			
			
	
			
			
		}
			
}


