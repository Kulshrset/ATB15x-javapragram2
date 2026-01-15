package ex_13_function;

public class lab5_ut {

    public static void main(String[] args) {

        // Without parameter, without return
        wop_wor_greet();

        // Without parameter, with return
        String msg = wop_wor_greet_2();
        System.out.println(msg);
    }

    // Without parameter, with return
    static String wop_wor_greet_2() {
        return "Hello from function with return value";
    }

    // Without parameter, without return
    private static void wop_wor_greet() {
        System.out.println("Hello from function without return value");
    }
}

