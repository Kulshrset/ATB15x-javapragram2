package ex_08_ternary;

import java.util.Scanner;

public class lab6_even_odd {

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter teh no");
        int a= sc.nextInt();

        String result= (a%2==0) ? "even" :"odd";
        System.out.println(result);
    }
}
