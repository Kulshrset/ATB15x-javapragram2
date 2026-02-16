package ex_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class map10 {
    static void main(String[] args) {
        Map<String ,String > countries= new LinkedHashMap<>();
        countries.put("IN", "INDIA");
        countries.put("US", "UNITED STATES");
        countries.put("UK", "UNITED KINGDOM");
        countries.put("CA", "CANADA");
        countries.put("AU", "AUSTRALIA");

        System.out.println(countries);
    }
}
