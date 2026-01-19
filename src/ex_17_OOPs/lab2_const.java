package ex_17_OOPs;

import org.w3c.dom.ls.LSOutput;

public class lab2_const {
    static void main(String[] args) {


        Student s1 = new Student();
        s1.name = "nishu";
        System.out.println(s1.name);

        Student s2;  //object reference
        new Student(); //object creation


    }



    static class Student{
        String name;

        //it is called default constructor,same as a name class.
        Student (){
            System.out.println("dc");
        }



        void sleep(){
            System.out.println("sleeping");
        }
    }
}
