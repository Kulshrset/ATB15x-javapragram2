package ex_27_collection_framework.ex_cf_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list_sorting {
    static void main(String[] args) {
       List marks= new ArrayList();
       marks.add(91);
        marks.add(-1);
        marks.add(56);
        marks.add(81);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
    }

}
