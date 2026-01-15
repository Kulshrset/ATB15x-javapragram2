package ex_06_String;

public class interview {
    static void main(String[] args) {

        String s1="HELLO";
        String s2="HELLO";


        String s3=new String("HELLO");
        String s4=new String("HELLO");
        String s5=new String("hELLO");
        System.out.println(s1);
        System.out.println(s2);


        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3.equals(s5));

        System.out.println(s3.equalsIgnoreCase(s5));
        ;


    }
}
