package ex_14_do_while;

import java.util.Scanner;
//Write a program to print odd numbers using do-while.
public class lab4_oddno {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        do {
            System.out.println("enter number a");
            a = sc.nextInt();
            a++;
        } while (a % 2 != 0);
        System.out.println("number is odd");
    }
}
