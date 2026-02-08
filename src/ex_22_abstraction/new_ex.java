package ex_22_abstraction;

public class new_ex {

    static void main(String[] args) {
          alto car = new alto();
           car.drive();
    }
}






















class alto extends car1{

    @Override
    void startcar() {
        System.out.println("starting the car");
        stopcar();
    }

    @Override
    void stopcar() {
        System.out.println("stoping the car");
    }

    public void drive() {
        System.out.println("driving the car now");
    }
}

abstract class  car1{

    abstract  void startcar();
    abstract void stopcar();
}
