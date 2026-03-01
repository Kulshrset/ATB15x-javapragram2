package String2;

import java.util.Scanner;

public class palindrome {
    static void main() {
        Scanner sc= new Scanner(System.in);
        String yourstring= sc.nextLine();

        String rev="";


        for (int i=yourstring.length()-1;i>=0;i--){
            rev=rev+ yourstring.charAt(i);
        }
        if(yourstring.equalsIgnoreCase(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println(" not palindrome");
        }
sc.close();

    }
}
