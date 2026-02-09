package ex_24_exceptions;

import com.sun.security.jgss.GSSUtil;

public class lab3_handleing {
    static void main(String[] args) {
        int a=0;
        try {
            a=10/0;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("error in your program");
        }
        System.out.println(a);

    }
}
