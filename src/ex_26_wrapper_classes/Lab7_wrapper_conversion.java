package ex_26_wrapper_classes;

public class Lab7_wrapper_conversion {
    static void main(String[] args) {
        String num="10";
        int aa=10;


        //string to -> Wrapper conversion

        Integer a=Integer.parseInt(num);
        System.out.println(a);


        //String to primitive

        Integer a2= Integer.valueOf("12");
        System.out.println(a2);



    }
}
