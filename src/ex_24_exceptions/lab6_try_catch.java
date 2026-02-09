package ex_24_exceptions;

public class lab6_try_catch {
    static void main(String[] args) {
        String s1=null;
        try {
            s1.trim();
            int a=10/0;
        } catch (NullPointerException | ArithmeticException e)
        {
            System.out.println("null error");
        }
        catch (Exception e){
            System.out.println("yes");
        }

        System.out.println("end");
    }
}
