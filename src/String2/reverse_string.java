package String2;

import java.util.Scanner;

public class reverse_string {

    //reversed string
   public static void main() {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
       System.out.println("enter the next string");

       String rev="";

       for (int i=str.length()-1;i>=0;i--){
           rev=rev+str.charAt(i);
       }


       System.out.println("reversed" +" "+ rev);






    }
}
