package ex_24_exceptions;

public class lab10_int {
    static void main(String[] args) {
        try {
            String ip=args[0];
            int a=Integer.parseInt(ip);
            int b=100/a;
            System.out.println(b);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
