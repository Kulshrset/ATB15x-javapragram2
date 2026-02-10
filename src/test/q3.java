package test;
//Implement a class "Student" with attributes "name", "rollNo", and "section". Add a method to print student details.
public class q3 {
    static void main(String[] args) {
        student s=new student();
        s.name="nishu";
        s.rollno=20;
        s.section='a';
        s.printdetails();

    }
}

class student {
    String name;
    int rollno;
    char section;

    void printdetails(){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(section);

    }

}