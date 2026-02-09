package ex_24_exceptions;

public class lab4_try_catch {
    static void main(String[] args) {
        System.out.println("1");
        try {
          int   a=10/0;
        }
        catch (ArithmeticException e) {
            System.out.println("you are fool;");
        }
        System.out.println("2");
    }
}
