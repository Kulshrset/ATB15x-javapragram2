package ex_06_String;

import java.util.Scanner;

public class lab009_reverse2 {
     public static void main() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a string:");
         String str = sc.nextLine();
        String reverse=" " ;

         for(int i=str.length()-1;i>=0;i--){
             reverse =reverse + str.charAt(i);
         }
         System.out.println(reverse);


 }



     }

