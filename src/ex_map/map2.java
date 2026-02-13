package ex_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map2 {
    static void main(String[] args) {
        Map m=new HashMap<>();
        Map m1= new TreeMap<>();
        Map m2= new LinkedHashMap();
        Map <String,Integer> marks= new HashMap<>();
        marks.put("alice",45);
        marks.put("pice",56);
        marks.put("klice",82);
        marks.put("mlice",92);
        marks.put("dlice",12);
        System.out.println(marks);


        System.out.println(marks.get("Alice"));
        System.out.println(marks.getOrDefault("plice",4));


        marks.put("Alice",88);
        System.out.println("Alice");
    }
}
