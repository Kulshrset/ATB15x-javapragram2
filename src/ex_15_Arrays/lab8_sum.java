package ex_15_Arrays;

public class lab8_sum {
    static void main(String[] args) {
        int[] num={11,20,45,45};
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println(sum);
    }
}
