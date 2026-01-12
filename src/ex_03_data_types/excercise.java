package ex_03_data_types;

import java.sql.SQLOutput;
import java.util.Scanner;

public class excercise {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float a,b;
        System.out.println("enter value a");
        a= sc.nextInt();
        System.out.println("enter value b");
        b= sc.nextInt();
        if(a<=18 ||b>10){
            System.out.println("yes you are able to drive");


        }
        else{
            System.out.println("no able to drive");
        }
    }
}
