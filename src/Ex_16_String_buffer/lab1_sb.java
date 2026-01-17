package Ex_16_String_buffer;

import static java.lang.System.*;

public class lab1_sb {
    static void main(String[] args) {
        //create string buffer
         StringBuffer sb=new StringBuffer("hello");
        out.println(sb);

//append function
        sb.append("nishu");
        out.println(sb);

        //insert text at given position

        sb.insert(6,"java");
        out.println(sb);

//replace a substring

        sb.replace(6,10,"kk");
        out.println(sb);

        //deelte a String

        sb.delete(6,10);
        out.println(sb);

        //reverese string
        sb.reverse();
        out.println(sb);



        // rerurn a character  at aspecific indfex

        StringBuffer sb1=new StringBuffer("hello");
        out.println(sb.charAt(0));

//length
        out.println(sb.length());


        //extract asubstring
        StringBuffer sb2=new StringBuffer("hello");
        out.println(sb.subSequence(0,5));

//convert String buffer into String
        StringBuffer sb3=new StringBuffer("hello");
        String str=sb.toString();
        out.println(str);


    }
}
