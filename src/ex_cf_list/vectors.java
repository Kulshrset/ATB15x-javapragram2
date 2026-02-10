package ex_cf_list;
import java.util.Vector;
public class vectors {
    static void main(String[] args) {
       // Object vectors;
        Vector  v= new Vector<>();
        v.add("nishu");
        v.add(12);
        v.add("lucky");

        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.indexOf(2));
        v.remove(2);

        System.out.println(v.contains("noshu"));


    }
}


