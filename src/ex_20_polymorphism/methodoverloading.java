package ex_20_polymorphism;

public class methodoverloading {

    //compile time or static or method_overloading





    static void main(String[] args) {
     home a1=new home();
     a1.task(4);
     a1.task(true);

    }
}

class home{

    void task(){
        System.out.println("task 1");

    }
    int task(int a){
        System.out.println("task 1");
        return a;
    }

    boolean task(boolean a){
        return  false;
    }





}
