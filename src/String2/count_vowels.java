package String2;

import java.util.Scanner;

public class count_vowels {
    static void main() {
        Scanner sc= new Scanner(System.in);
        String mystring= sc.nextLine();

        //String count="";

        int count=0;
        for(int i=0;i<mystring.length();i++){
            char ch=Character.toLowerCase(mystring.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;

            }

        }
        System.out.println(count);
    }
}
