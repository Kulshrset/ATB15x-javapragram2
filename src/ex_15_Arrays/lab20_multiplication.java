package ex_15_Arrays;

import java.util.Scanner;

public class lab20_multiplication {
    static void main() {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int n=sc.nextInt();

        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print(i*j +"|");
            }
            System.out.println();
        }


    }
}
