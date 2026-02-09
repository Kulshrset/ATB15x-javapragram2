package ex_24_exceptions;

public class lab15_trrow {
    static void main(String[] args) {

    }
    static void divideByZero(int a){
        if(a==0){
            throw new ArithmeticException("error a==0");
        }
    }
}
