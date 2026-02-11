package ex_set;

import java.util.HashSet;
import java.util.Set;

public class set {
    static void main(String[] args) {
       // Set myset=new set();

        Set set= new HashSet<>();
        HashSet<Object> st=new HashSet<>(10);
        set.add("Apple");
        set.add("mango");
        set.add("banana");
        set.add("apple");
        set.add(5);
        set.add(6);
        set.add(5);

        //note storing the duplicate values

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains("banana"));

    }
}
