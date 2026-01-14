package ex_08_ternary;

import java.util.Scanner;

public class lab6_max_three {

        public static void main(String[] args) {
           // int a , b , c ;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the no");
            int a= sc.nextInt();
            System.out.println("enter the no");
            int b= sc.nextInt();
            System.out.println("enter the no");
            int c= sc.nextInt();

            int max = (a > b)
                    ? (a > c ? a : c)
                    : (b > c ? b : c);

            System.out.println("Maximum number is: " + max);
        }


}
