package ex_map;

import java.util.Map;
import java.util.TreeMap;

public class map11 {
    static void main(String[] args) {
        Map m=new TreeMap<>();

        m.put("banana", 40);
        m.put("apple", 50);
        m.put("banana", 40);
        m.put("mango", 80);
        m.put("orange", 60);
        m.put("grapes", 70);

        System.out.println(m);

    }
}
