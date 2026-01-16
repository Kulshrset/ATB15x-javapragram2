package ex_15_Arrays;

import java.util.Arrays;

public class lab5_arrays_max {
    static void main(String[] args) {
        int [] arr={45,85,45,95,56,25};
       // Arrays.sort(arr);
      //  System.out.println(arr[arr.length-1]);

int max=arr[0];
for(int i=0; i<arr.length;i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
    System.out.println(max);

int min= arr[0];
for(int i =0; i<arr.length;i++){
    if(arr[i]<min){
        min=arr[i];
    }
}
        System.out.println(min);
    }

}
