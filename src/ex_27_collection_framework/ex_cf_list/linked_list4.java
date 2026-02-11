package ex_27_collection_framework.ex_cf_list;

import java.util.LinkedList;

public class linked_list4 {
    static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        //adding elements

        list.add("apple");
        list.add("mango");
        list.add("chiku");
        list.add("banana");
        list.add("guava");

        System.out.println(list);


        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        System.out.println(list);
        System.out.println(list.size());



    }
}
