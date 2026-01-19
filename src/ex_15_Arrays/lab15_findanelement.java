package ex_15_Arrays;

public class lab15_findanelement {
    static void main(String[] args) {
        int [] a={23,52,46,85,92,34};
        int target=85;
        for(int i=0;i<a.length;i++){
            if(target==a[i]){
                System.out.println(i);
            }
        }
    }
}
