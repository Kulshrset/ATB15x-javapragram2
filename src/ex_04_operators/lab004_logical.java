package ex_04_operators;

public class lab004_logical {
    static void main(String[] args) {


        int a = 10;
        int b = 9;
        int c = 98;
        boolean d = (a > b || a<c);
        boolean e = (a < b && a<c);
        boolean  f=(a!=b);
        System.out.println(e);
        System.out.println(d);
        System.out.println(f);


    }
}
