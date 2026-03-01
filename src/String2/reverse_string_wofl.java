package String2;

import java.util.Scanner;

public class reverse_string_wofl {
    static void main() {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println("enter the string");


        String rev= new StringBuilder(str).reverse().toString();
        System.out.println(rev);
        sc.close();
    String upper=rev.toUpperCase();
        System.out.println(upper);



    }
}
