// A class is a blueprint for an object.

class Student {      //This is a class
    String name;
    String gender;
    int rollNo;
    int batch;

}

public class BasicOOPS {
    public static void main(String[] args) {
        //object creation
        Student s1 = new Student(); // this will automatically call default constructor even if we do not make one;
        s1.name = "Vedant";
        s1.gender = "Male";
        s1.rollNo = 25;
        s1.batch = 1;
        System.out.println("Student name: "+s1.name);
        System.out.println("Student gender: "+s1.gender);
        System.out.println("Student roll number: "+s1.rollNo);
        System.out.println("Student batch: "+s1.batch);
    }
}
