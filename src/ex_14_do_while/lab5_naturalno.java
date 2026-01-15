package ex_14_do_while;

import java.util.Scanner;

public class lab5_naturalno {
    private static Object sum;

    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of n");
        int n=sc.nextInt();
        
        int i=1;
        int sum=0;
        do{
            sum=sum+i;
            i++;
        }while(i<=n);
        System.out.println("sum of first natural numbers=" + sum);
    }
}
