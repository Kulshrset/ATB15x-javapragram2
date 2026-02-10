package ex_stack;

import java.util.Stack;

public class stack {
    static void main(String[] args) {
        Stack s1=new Stack<>();
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add("nishu");

        System.out.println(s1);
        System.out.println(s1.size());
        System.out.println(s1.peek());
        System.out.println(s1.pop());
      //  s1.pop(2);





    }
}
