package package1;

public class Overload_Concept {
	
	private int a;
	public int b;
	protected int c;
	int d;
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void print(String name) {
		System.out.println("Name given is: "+name);
	}
	
	public void print(int id) {
		System.out.println("The given id is: "+id);
	}

	public void print(String name, int id) {
		System.out.println("Name given is: "+name);
		System.out.println("The given id is: "+id);
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

}
