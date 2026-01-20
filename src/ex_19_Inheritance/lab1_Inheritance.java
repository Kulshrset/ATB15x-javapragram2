package ex_19_Inheritance;

public class lab1_Inheritance {

    static void main() {
        father f1=new father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        son s1=new  son();
        System.out.println(s1.gold_f);
        s1.bhk3();
        s1.bhk2();

    }

    static class father {
        int gold_f = 1000;

        void bhk2() {
            System.out.println("father-2bhk");
        }
    }


    static class son extends father {


        //@Override
        void bhk3() {
            System.out.println("3BHK son");
        }
    }
}
