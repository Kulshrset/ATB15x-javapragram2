package ex_06_String;

import java.util.Collections;

public class lab008_reverse {
    static void main(String[] args) {
        String name="kulshrset";
        String name1="kulshret";
        StringBuffer sb=new StringBuffer(name);
       // String  slk=new String(name1);
      //  Collections sc;
        sb.reverse();
        System.out.println(sb);
        
    }
}
