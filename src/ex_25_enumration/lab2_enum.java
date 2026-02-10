package ex_25_enumration;

public class lab2_enum {
    static void main(String[] args) {
        day today= day.sat;
        switch (today){
            case mon -> System.out.println("mon");
            case sat -> System.out.println("sat");
        }
       // System.out.println(API_URLS("google"));
    }
}
