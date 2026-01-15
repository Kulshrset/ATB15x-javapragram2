
package ex_10_switch_statements;
import java.util.Scanner;

public class lab2_switch {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter day num (1 to 7)");
         int day=sc.nextInt();
         switch(day){
             case 1:
                 System.out.println("mon");
                 break;
             case 2:
                 System.out.println("tue");
                 break;
         }

    }
}
