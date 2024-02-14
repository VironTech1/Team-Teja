package collections;

public class StudentData implements Comparable<StudentData> {

	private String name;
	private int age;
	private int id;
	private long phnNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhnNumber() {
		return phnNumber;
	}

	public void setPhnNumber(long phnNumber) {
		this.phnNumber = phnNumber;
	}

	public StudentData(String name, int age, int id, long phnNumber) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.phnNumber = phnNumber;
	}

	@Override
	public String toString() {
		return "StudentData [name=" + name + ", age=" + age + ", id=" + id + ", phnNumber=" + phnNumber + "]";
	}

	@Override
	public int compareTo(StudentData o) {
		// TODO Auto-generated method stub
		System.out.println("CompareTo Method");
		return 1;
	}

}
