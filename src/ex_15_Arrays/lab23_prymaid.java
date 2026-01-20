package ex_15_Arrays;

import java.util.Scanner;

public class lab23_prymaid {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in) ;
        System.out.println("enter the number n");
        int n=sc.nextInt();

                for (int i = 1; i <= n; i++) {
                    for (int j = i; j < n; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }

