package Ex_16_String_buffer;

public class Lab3_String {

    // Main Method (After class Person creation)
    public static void main(String[] args) {

        // Outer class object
        Lab2_String obj = new Lab2_String();

        // Person object creation
      //  Person p1 = obj.new Person("Rahul", 22);

        // Method call
       // p1.display();
    }

    // Person class
    class Person {
        String name;
        int age;

        // Constructor
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

}
