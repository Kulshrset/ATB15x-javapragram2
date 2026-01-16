package ex_05_operators;

import java.util.Scanner;

public class palindron {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr a String");
        String str= sc.nextLine();

        String reversed_string= " " ;

        for(int i=str.length()-1; i>=0; i--){
            reversed_string= reversed_string+ str.charAt(i);
        }
        if(reversed_string.equalsIgnoreCase(str)){
            System.out.println("Palindrome");
        }else {
            System.out.println("not a palindrom");
        }

    }

}
