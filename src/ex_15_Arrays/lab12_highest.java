package ex_15_Arrays;

import java.util.Arrays;

public class lab12_highest {
    static void main(String[] args) {
        int[] marks = {45, 65, 85, 45, 62, 75, 45};


        Arrays.sort(marks);
        System.out.println(marks[marks.length-1]);

    }
}
