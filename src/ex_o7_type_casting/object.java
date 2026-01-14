package ex_o7_type_casting;

public class
object {
    static void main(String[] args) {
        long no=45785l;
        short s=(short)no;

        int course=1220;
        float gst=14.455f;
        int c=course+ (int)gst;
        float d=c;
        System.out.println(c);
        System.out.println(d);
    }
}
