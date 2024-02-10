package variables;

public class Sample extends Base {
	
	int id;
	String name;
	
	static {
		
		System.out.println("ASDFGHJK");
	}

	static int b;
	
	Sample(int id, String name)
	{
		super(id+35,name+" Chand");
		this.id = id;
		this.name = name;
		//Sub Class variables
		System.out.println(this.id);
		System.out.println(this.name);
				
		//Super class variables
		System.out.println(super.id);
		System.out.println(super.name);
		
	}
	static void method() {
		System.out.println("Gopi Chand velaga");
	}
	
	
	
}
