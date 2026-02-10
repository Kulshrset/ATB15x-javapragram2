package ex_cf_list;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
    static void main(String[] args) {
        List list= new ArrayList();
        list.add("1");
        list.add("2");
        list.add(true);
        list.add("1");
        list.add("2");
        list.add(true);


        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));
        System.out.println(list.indexOf(4));

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
