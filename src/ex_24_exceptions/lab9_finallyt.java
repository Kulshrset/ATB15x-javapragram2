package ex_24_exceptions;

import java.util.Scanner;

public class lab9_finallyt {
    static void main(String[] args) {
        Scanner sc=null;
        sc =new Scanner(System.in);
        System.out.println("enter the v");
        int v= sc.nextInt();
try {
    int b=10/v;
} catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}finally {
    sc.close();
}

    }
}
