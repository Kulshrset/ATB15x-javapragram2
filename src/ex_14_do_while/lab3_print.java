package ex_14_do_while;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lab3_print {
    static void main(String[] args) {
        //Write a program to print even numbers using do-while
        Scanner sc = new Scanner(System.in);

        int a;
        do {
            System.out.println("enter number a");
            a = sc.nextInt();
            a++;
        } while (a % 2 == 0);
        System.out.println("number is even");

    }
}
