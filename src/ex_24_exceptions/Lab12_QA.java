package ex_24_exceptions;

public class Lab12_QA {
    static void main(String[] args) {
        final  double pi=3.14;
        int a=0;
        try {
            int x=10/a;


        }catch (Exception e){
            System.out.println("div by zero");
        }
        finally {
            System.out.println(" i will be executed any how");
        }
    }
}
