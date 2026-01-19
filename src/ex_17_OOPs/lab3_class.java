package ex_17_OOPs;

public class lab3_class {
    static void main() {
        cat c1 = new cat();
        new cat();
        cat c2;

     c1.running();
    }
}
    class  cat{
        String name;

        void running(){
            System.out.println("running");

    }
}
