package ex_cf_list;

import java.util.ArrayList;
import java.util.List;

public class list {


        public static void main(String[] args) {
            List fruits = List.of("orange", "mango", "banana", "apple");
            System.out.println(fruits);
            List<String> list2 = new ArrayList<>();
            list2.add("Java");
            list2.add("Python");
            list2.add("C");
            list2.add("C++");
            list2.add("SQL");

            // Third ArrayList
            List<Double> list3 = new ArrayList<>();
            list3.add(1.1);
            list3.add(2.2);
            list3.add(3.3);
            list3.add(4.4);
            list3.add(5.5);

            System.out.println(list2);
            System.out.println(list3);




        }
    }




