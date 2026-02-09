package ex_24_exceptions;

public class lab8_finally {
    static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int c=0;
        try {
            c=10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("always using");
        }
    }
}
