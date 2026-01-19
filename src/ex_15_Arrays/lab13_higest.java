package ex_15_Arrays;

public class lab13_higest {
    static void main(String[] args) {
        int array[]={45,85,95,68,76,30};
        int max= array[0];

        for( int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }

        }
        System.out.println(max);
    }
}
