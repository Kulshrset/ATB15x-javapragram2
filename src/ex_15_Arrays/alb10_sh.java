package ex_15_Arrays;

public class alb10_sh {
   public static void main(String[] args) {
       int[] arr= {45,23,98,75,64};

       int max=arr[0];
       int sec_max=arr[0];
       for (int i=0;i<arr.length;i++){
           if(arr[i]>max){
               sec_max=max;
               max=arr[i];

           }
           else if(arr[i]>sec_max  &&  arr[i]!=max){
               sec_max=arr[i] ;
           }
       }
       System.out.println(max);
       System.out.println(sec_max);

    }
}
