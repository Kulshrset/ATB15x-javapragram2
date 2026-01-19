package ex_18_oops_const;

public class lab1_const {
    static void main() {
    Baby b1=new Baby();
    b1.sleep();
    }
}


class Baby{
    String name;
    //default constructors
    Baby(){
        System.out.println(" i am called default constructors");
    }

    void sleep(){
        System.out.println("sleeping");

    }

    void cry(){
        System.out.println("eating");

    }
    void eat(){
        System.out.println("crying");

    }










}
