package ex_13_function;

import java.util.Scanner;

public class lab6_top {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no a");
        int x=sc.nextInt();

        System.out.println("enter no b");
        int y=sc.nextInt();

        int max=max_fun(x,y);
        int sum=sum_fun(x,y);
    }


   public  static int max_fun(int a, int b){
        return (a >= b)? a:b;

    }

    public  static int sum_fun(int a, int b) {
        return (a + b);
    }
    }
