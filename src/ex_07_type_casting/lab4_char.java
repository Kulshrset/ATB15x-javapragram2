package ex_07_type_casting;

public class lab4_char {
    static void main(String[] args) {
     char ch='A';
     int ascii=ch;
        char num2='b';
     int d=ch+num2;

      int num=99;

      char letter=(char)num;
        System.out.println(letter);
        System.out.println(ch);
        System.out.println(d);
    }
}
