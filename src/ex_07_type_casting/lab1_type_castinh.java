package ex_07_type_casting;

public class lab1_type_castinh {
    static void main(String[] args) {
        byte b=10;
        int a=b;
        int a1=(int)b;
        System.out.println(b);
        Object obj=b;
        System.out.println(obj.getClass());
    }
}
