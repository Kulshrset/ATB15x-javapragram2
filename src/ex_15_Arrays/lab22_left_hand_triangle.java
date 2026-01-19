package ex_15_Arrays;

import java.util.Scanner;

public class lab22_left_hand_triangle {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
