class Student {
    int studentId;
    String studentName;
    String email;
    long phone;
    String address;
    long phhonember;
}


class StudentMain {

  public static void main(String[] args) {

     int i= 10;
     String str="Hello";
     int[] oneD = {10,20,30,40,50};

/* Class itself becomes a userdefined datatype */
/* Object is a group of values */
     
    Student stu1 = new Student();

    stu1.studentId = 1234;
    stu1.studentName = "Gopi";
    stu1.email = "gop@gmail.com";
    stu1.phone = 1234567890;
    stu1.address = "800 W Forest Meadow st, Flagtaff, 86001, Arizona";
    
    System.out.println("Id :" + stu1.studentId);
    System.out.println("Student Name:" + stu1.studentName);
    System.out.println("Student Email : " + stu1.email);
    System.out.println("Phone : " + stu1.phone);
    System.out.println("Address :" + stu1.address);

    System.out.println("***************************************************");

    Student stu2 = new Student();

    stu2.studentId = 4321;
    stu2.studentName = "Lakshmi";
    stu2.email = "lak@gmail.com";
    stu2.phone = 25414417;
    stu2.address = "800 W Forest Meadow st, Flagtaff, 86001, Arizona";
    
    System.out.println("Id :" + stu2.studentId);
    System.out.println("Student Name:" + stu2.studentName);
    System.out.println("Student Email : " + stu2.email);
    System.out.println("Phone : " + stu2.phone);
    System.out.println("Address :" + stu2.address);
    
    System.out.println("***************************************************");

    Student stu3 = stu1;
    System.out.println("Id :" + stu3.studentId);
    System.out.println("Student Name:" + stu3.studentName);
    System.out.println("Student Email : " + stu3.email);
    System.out.println("Phone : " + stu3.phone);
    System.out.println("Address :" + stu3.address);

    System.out.println("***************************************************");

    stu1.studentId = 1238;

    System.out.println("Updated Values");
    System.out.println("Id :" + stu1.studentId);
    System.out.println("Id :" + stu3.studentId);

    System.out.println(stu1);
    System.out.println(stu2);
    System.out.println(stu3);
   



    //Student stu3 = stu1;
    
   
    //stu3.student*/
     
}
}