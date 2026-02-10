package ex_26_wrapper_classes;

public class lab9_qa {
    static void main(String[] args) {
        Integer a=127;
        Integer b=127;
        System.out.println(a==b);//true(cached)


        Integer c=128;
        Integer d=128;
        System.out.println(c==d);
        //not cached
        System.out.println(c.equals(d));
    }
}

//java caches values from -128 to 127