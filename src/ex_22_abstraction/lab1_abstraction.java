package ex_22_abstraction;

public class lab1_abstraction {
}

class vehicle{
    public int maxSpeed=190;

    vehicle(){
        System.out.println("default const");
    }



    vehicle(int a){
        System.out.println("kulshrest");
    }

    vehicle(int a, int b){
        System.out.println("kulshrest");
    }



    void message(){
        System.out.println("no returns , no arguments");
    }


    void message(int a){
        System.out.println("arguments");
    }


    void drive(){
        System.out.println("vehicle parent");
    }



    void noTest(){
        System.out.println("arguments");
    }

}




class car extends vehicle{
    private int maxSpeed=180;

    car(){
        super(100);
    }

    car(int a){
        System.out.println("bmw");
    }

void test(){

}
    @Override
    void drive() {
        super.drive();
        this.test();
        super.noTest();
    }
}



