package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentMain {

	public static void main(String[] args) {

		StudentData stu1 = new StudentData("Gopi Chand", 25, 1234, 9288639761L);
		StudentData stu2 = new StudentData("Gnaneshwar", 23, 1235, 9288639828L);
		StudentData stu3 = new StudentData("Lakshmi Reddy", 22, 1236, 9288639861L);
		StudentData stu4 = new StudentData("Varun Teja", 24, 1237, 9642985343L);
		StudentData stu5 = new StudentData("Tejaswini", 24, 1238, 9288639781L);
		StudentData stu6 = new StudentData("Priyanka", 24, 1239, 9288697894L);
		StudentData stu7 = new StudentData("Tejaswini", 25, 1240, 9288639762L);
		StudentData stu8 = new StudentData("Gopi Chand", 25, 1234, 9288639761L);
		StudentData stu9 = stu2;

		try {  

			TreeSet<StudentData> tsStu = new TreeSet<StudentData>();

			tsStu.add(stu1);
			tsStu.add(stu2);
			tsStu.add(stu3);
			tsStu.add(stu4);
			tsStu.add(stu5);
			tsStu.add(stu6);
			tsStu.add(stu7);
			tsStu.add(stu8);
			System.out.println("Tree Set");
			for (StudentData i : tsStu) {
				System.out.println(i);
			}

		} catch (Exception e) {
			System.out.println("Exception: " + e);
			// Exception: java.lang.ClassCastException: class collections.StudentData cannot
			// be cast to class java.lang.Comparable (collections.StudentData is in module
			// Sample of loader 'app'; java.lang.Comparable is in module java.base of loader
			// 'bootstrap')

		}

		// hashset not eliminating duplicates
		HashSet<StudentData> hsStu = new HashSet<StudentData>();

		hsStu.add(stu1);
		hsStu.add(stu2);
		hsStu.add(stu3);
		hsStu.add(stu4);
		hsStu.add(stu5);
		hsStu.add(stu6);
		hsStu.add(stu7);
		hsStu.add(stu8);
		hsStu.add(stu9);
		System.out.println("Hash Set");
		for (StudentData i : hsStu) {
			System.out.println(i);
		}

		ArrayList<StudentData> students = new ArrayList<StudentData>();

		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		students.add(stu4);
		students.add(stu5);
		students.add(stu6);
		students.add(stu7);
		students.add(stu8);

		// Printing student details
		System.out.println("Array List");
		for (StudentData i : students) {
			System.out.println(i);
		}

		// Searching student with help of student id.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter student id to search:");

		int id = sc.nextInt();

		for (StudentData stu : students) {
			if (id == stu.getId())
				System.out.println("The Student details with id: " + id + " are as follows: \n" + stu);
		}

		// Deleting student with hlep of student id

		System.out.println("Enter student id to delete:");

		int stuId = sc.nextInt();

		try {
			for (StudentData stu : students) {
				if (stuId == stu.getId()) {
					System.out.println("Deleting student details with id: " + stuId);
					students.remove(stu);
				}
			}

			// Printing student details after deletion
			System.out.println("After deletion");
			for (StudentData i : students) {
				System.out.println(i);
			}
		}

		catch (Exception e) {
			System.out.println("Exception: " + e);
			//Exception: java.util.ConcurrentModificationException
		}

		// Updating student name with hlep of student id

		System.out.println("Enter student id to rename the name of the student:");

		int stuId1 = sc.nextInt();

		for (StudentData stu : students) {
			if (stuId1 == stu.getId()) {
				System.out.println("Renamoing student name with id: " + id);
				stu.setName("Venkata Ramana");
			}
		}

		// Printing student details after Modification

		for (StudentData i : students) {
			System.out.println(i);
		}

	}

	

}
