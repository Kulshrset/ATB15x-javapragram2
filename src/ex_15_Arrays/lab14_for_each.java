package ex_15_Arrays;

public class lab14_for_each {
    static void main(String[] args) {
        for (int i=0;i< args.length;i++){
            System.out.println(args[i]);
        }
        for(String o: args){
            System.out.println(args);
        }
    }
}
