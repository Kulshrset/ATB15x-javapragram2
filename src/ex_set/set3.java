package ex_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set3 {
    static void main(String[] args) {
        Set <Integer> s=new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);

        s.add(1);

        System.out.println(s);

        Iterator iterator=s.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
