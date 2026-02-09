package ex_24_exceptions;

import java.util.Scanner;

public class lab16_throw
{
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age");

        int age= sc.nextInt();
        try {
            validdateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    static void validdateAge(int age) throws Exception {
        if(age<18){
            throw  new Exception("you are minor");
        }
    }
}
