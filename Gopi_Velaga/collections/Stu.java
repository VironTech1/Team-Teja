package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu {

	int id;
	String name;

	public Stu(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		Stu s1 = new Stu(1, "gopi");
		Stu s2 = new Stu(2, "akhil");

		ArrayList al = new ArrayList();

		al.add(s1);
		al.add(s2);

		System.out.println("Enter Stuent id to search:");
		Scanner sc = new Scanner(System.in);

		int id = sc.nextInt();

		for (int i = 0; i < al.size(); i++) {
			if (id == ((Stu) al.get(i)).id) {
				System.out.println(al.get(i).toString());
			}
		}
	}

}
