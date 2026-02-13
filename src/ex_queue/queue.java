package ex_queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        // Adding elements
        q.add("A");
        q.add("B");
        q.add("C");

        System.out.println("Queue: " + q);


        System.out.println("Head element: " + q.peek());

        // Remove element
        q.remove();
        System.out.println("After removal: " + q);
    }
}
