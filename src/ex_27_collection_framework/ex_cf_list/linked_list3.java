package ex_27_collection_framework.ex_cf_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class linked_list3 {
    static void main(String[] args) {
        List <String> mylist= new ArrayList();
        List <String> mylist1= new ArrayList();

        mylist.add("nishu");
        mylist.add("mohit");
        mylist.add("kushal");



        for(String name:mylist){
            System.out.println(name);
        }

     for(int i=0; i<mylist.size();i++){
         System.out.println(mylist.get(i));
     }


        Iterator iterator= mylist.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }


    }
}
