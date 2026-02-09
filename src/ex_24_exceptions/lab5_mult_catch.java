package ex_24_exceptions;

public class lab5_mult_catch {
    static void main(String[] args) {
        System.out.println("1");
        try {
           int a=10/0;
        }
        catch (ArithmeticException e) {
            System.out.println("wrong ");
        }
        catch (Exception e){
            System.out.println("again you are wrong");
        }
        System.out.println("2");
    }
}
