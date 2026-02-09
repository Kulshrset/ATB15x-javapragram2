package ex_24_exceptions;

public class lab7_IQ {
    static void main(String[] args) {
        int c=0;
        int b=0;
        try{
            b=10/c;

        }catch (ArithmeticException e){
            System.out.println("error ");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
