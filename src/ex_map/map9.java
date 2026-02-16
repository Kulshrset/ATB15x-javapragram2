package ex_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map9 {
    static void main(String[] args) {
      Map m1= new HashMap<>();
      m1.put("name", "promad");
      m1.put("roll.no", 1);
      m1.put("phone",74177971);
        System.out.println(m1);

Map m2=new LinkedHashMap();

        m2.put("name", "promad");
        m2.put("roll.no", 1);
        m2.put("phone",74177971);
        System.out.println(m2);

        Map m3=new TreeMap();

        m3.put("name", "promad");
        m3.put("roll.no", 1);
        m3.put("phone",74177971);
        System.out.println(m3);


    }
}
