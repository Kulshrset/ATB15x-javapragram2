package ex_17_OOPs;

public class person {
    String name;
    int age;
    String height;
    String gender;
    String sleep;
    boolean is_married;
// these are called as behaviours, members functions, methods
    void walk() {
        System.out.println("walking");
    }

    void eat() {
        System.out.println("eating");
    }

    void sleep() {
        System.out.println("walking");
    }

    String sleep1(){
        System.out.println("sleep");
        return  null;
    }
    String food(int a){
        System.out.println("walking");
        return null;
    }


}


