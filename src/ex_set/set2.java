package ex_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set2 {
    static void main(String[] args) {
        Set<String> se= new HashSet<>();
        se.add(null);
        se.add("apple");
        se.add(null);
        System.out.println(se);
//only one null is allowed




        Set lhs=new LinkedHashSet();
        lhs.add("apple");
        lhs.add("waytermolan");
        lhs.add("banana");
        lhs.add("apple");
        lhs.add("waytermolan");
        lhs.add("banana");

        System.out.println(lhs);


        Set ts=new TreeSet();
        ts.add("apple");
        ts.add("waytermolan");
        ts.add("banana");
        ts.add("apple");
        ts.add("waytermolan");
        ts.add("banana");

//it has natural sorting
        //if you use null or different data like 123
        //sorting not happens
        System.out.println(ts);


    }
}
