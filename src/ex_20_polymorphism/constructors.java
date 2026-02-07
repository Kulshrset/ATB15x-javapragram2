package ex_20_polymorphism;

public class constructors {
    public static void main(String[] args) {

        nishu n1 = new nishu();          // default constructor
        nishu n2 = new nishu("kulshrest");   // parameterized constructor

        n2.running();
    }
}
// overloading constructors



class nishu {
    String name;

    // Default constructor
    nishu() {
        System.out.println("kur");
        System.out.println(this.name);  // null because name not set
    }

    // Parameterized constructor
    nishu(String nameGiven) {
        this.name = nameGiven;
    }

    void running() {
        int var = 90;
        System.out.println("who is running " + this.name);
    }
}
