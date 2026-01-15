package ex_10_switch_statements;

import java.util.Scanner;

public class lab3_real_switch {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the browser");
        String browser=sc.next();
        browser=browser.toLowerCase();;

        switch(browser){
            case "chrome":
                System.out.println("starting the chrome");
                System.out.println("......");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "edge"     :
                System.out.println("execute the edge");
                break;
            default:
                System.out.println("i have no idea which browser is this");
                break;



        }
    }
}
