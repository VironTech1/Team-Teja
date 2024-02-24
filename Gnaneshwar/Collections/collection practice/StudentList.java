import java.util.ArrayList;
import java.util.Iterator;

class Student {
    private int studentId;
    private String name;
    private int age;
    private String phone;

    public Student(int studentId, String name, int age, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

    
        studentList.add(new Student(1, "Ricky", 20, "123-456-7890"));
        studentList.add(new Student(2, "Lakshmi", 21, "456-789-0123"));
        studentList.add(new Student(3, "Gopi", 22, "789-012-3456"));
        studentList.add(new Student(4, "Srinivas", 23, "012-345-6789"));
        studentList.add(new Student(5, "Southen", 24, "345-678-9012"));

        
        int searchId = 3;
        for (Student student : studentList) {
            if (student.getStudentId() == searchId) {
                System.out.println("Student found by ID " + searchId + ": " + student);
                break;
            }
        }

        
        int deleteId = 2;
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentId() == deleteId) {
                iterator.remove();
                System.out.println("Student with ID " + deleteId + " deleted.");
                break;
            }
        }

    
        int updateId = 1;
        String newName = "Gnaneshwar";
        for (Student student : studentList) {
            if (student.getStudentId() == updateId) {
                student.setName(newName);
                System.out.println("Student name updated for ID " + updateId + ".");
                break;
            }
        }

        System.out.println("All students:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
