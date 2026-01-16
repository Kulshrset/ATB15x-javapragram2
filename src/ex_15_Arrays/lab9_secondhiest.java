package ex_15_Arrays;

import java.util.Arrays;

public class lab9_secondhiest
{
    static void main(String[] args) {
        int[] marks={10,5,5,87,56};
        Arrays.sort(marks);
        System.out.println(marks[marks.length-2]);
    }
}
