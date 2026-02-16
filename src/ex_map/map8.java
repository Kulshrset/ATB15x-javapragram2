package ex_map;
import java.rmi.MarshalException;
import java.util.*;
import java.util.HashMap;
import java.util.TreeMap;

public class map8 {
    static void main(String[] args) {
       Map m1=new HashMap<>();
       Map m2=new TreeMap<>();
       Map m3=new LinkedHashMap();


       Map <String,Integer> marks= new HashMap<>();
        marks.put("nishu", 95);
        marks.put("rahul", 88);
        marks.put("priya", 92);
        marks.put("amit", 76);
        marks.put("sneha", 85);
        marks.put("rohit", 90);
        marks.put("kavita", 81);
        marks.put("arjun", 97);
        marks.put("pooja", 89);
        marks.put("vishal", 73);
        marks.put("neha", 94);
//not follow the order
        System.out.println(marks);

        System.out.println(marks.get("Alice"));
        System.out.println(marks.size());



    }
}
