package ex_15_Arrays;

import java.util.Scanner;

public class lab6_input {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
    int[] number=new int[size];

    for (int i=0;i< number.length;i++){
        System.out.println("enter the marks");
        number[i]= sc.nextInt();
    }
        System.out.println("====");

      for(int i=0;i< number.length;i++){
          System.out.println(number[i]);
      }
    }

}
