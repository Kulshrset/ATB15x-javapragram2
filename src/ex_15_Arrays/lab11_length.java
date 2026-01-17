package ex_15_Arrays;

import java.util.Arrays;

public class lab11_length {
    static void main(String[] args) {
        int a = 198;
        int[] marks = {45, 65, 85, 45, 62, 75, 45};
        System.out.println(marks.length);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
        Arrays.sort(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
    }

