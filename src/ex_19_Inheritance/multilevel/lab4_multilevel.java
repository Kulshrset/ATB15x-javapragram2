package ex_19_Inheritance.multilevel;

public class lab4_multilevel {
    public static void main(String[] args) {
        grandfather gf=new grandfather();
        gf.gf();


        System.out.println(" -- ");

        father f1=new father();
        f1.f();
        f1.gf();

        System.out.println(" -- ");

        son f2=new son();
        f2.s();

        f2.gf();
        f2.f();






    }
}
