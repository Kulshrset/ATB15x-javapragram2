package ex_12_while_loop;

public class lab2_while {
    static void main(String[] args) {
        int a=0;
        while(a<2){
            System.out.println(a);
            a++;
        }

        do{
            System.out.println(a);
            a++;
        }while(a<2);
    }
}
