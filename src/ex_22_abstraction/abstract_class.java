package ex_22_abstraction;

public class abstract_class {
    static void main(String[] args) {
        son s1=new son();
        s1.loan30k();
        s1.loan10k();


    }

}
















abstract class father{

    abstract void  loan30k();


    void loan10k(){

        System.out.println("given");
    }
}


class son extends father{

    @Override
    void loan30k() {
        System.out.println("given by son");
    }
}