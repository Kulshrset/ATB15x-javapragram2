package ex_13_function;
import java.util.Scanner;
public class lab4_user_define {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a= sc.nextInt();
        System.out.println("enter a number");
        int b= sc.nextInt();
        int sum=sum_fun(a,b);
        System.out.println(sum);
    }

    static int sum_fun(int x, int y){
        return x+y;
    }
}
