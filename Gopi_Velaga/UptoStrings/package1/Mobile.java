package package1;

public class Mobile {
	String mobName;
	String simName;
	String screen;
	
	Mobile(String name, String na, String n){
		mobName = name;
		simName = na;
		screen = n;
	}
	
	void getDetails() {
		System.out.println("Mobile Details");
		System.out.println("Mobile Name:"+mobName);
		System.out.println("Sim Name:"+simName);
		System.out.println("Screen Type:"+screen);
		
	}
}
