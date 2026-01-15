package ex_10_switch_statements;

public class lab7_jdk13_intr {
    static void main(String[] args) {
        int itemCode = 002;
//no need to break it is already add
        switch (itemCode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("default");
        }
    }
}

