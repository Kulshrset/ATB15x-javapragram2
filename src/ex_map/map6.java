package ex_map;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class map6 {
    static void main(String[] args) {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Aman");
        students.put(103, "Priya");

        System.out.println("LinkedHashMap Data: " + students);

        TreeMap<Integer, String> students1 = new TreeMap<>();

        students.put(103, "Priya");
        students.put(101, "Rahul");
        students.put(102, "Aman");

        System.out.println("TreeMap Data: " + students1);

        Hashtable<Integer, String> students2 = new Hashtable<>();

        students.put(101, "Rahul");
        students.put(102, "Aman");
        students.put(103, "Priya");

        System.out.println("Hashtable Data: " + students2);



    }
}
