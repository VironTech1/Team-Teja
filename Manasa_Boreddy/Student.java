public class Student {
	int id;
	String name;
	String email;
	double phoneno;
	String address;
public Student()
{
	id=110;
	name="Manasa";
	email="manasaboreddy@gmail.com";
	phoneno=8167163;
	address="350E Armour Blvd";
}
public Student(int id,String name,String email,double phoneno,String address)
{
	this.id=id;
	this.name=name;
	this.email=email;
	this.phoneno=phoneno;
	this.address=address;
}

public void display()
{
	System.out.println("name:"+name);
	System.out.println("id:"+id);
	System.out.println("email:"+email);
	System.out.println("phoneno:"+phoneno);
	System.out.println("address:"+address);
}
}