package ex_06_String;

public class lab003_builder {
    static void main() {
        StringBuilder sc=new StringBuilder("nishu");
        sc.append(sc);
        sc.reverse();
        sc.replace(0,5,"hi");
        System.out.println(sc.reverse());

    }
}
