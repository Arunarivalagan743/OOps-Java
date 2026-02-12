package Collections;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(4);
        q.offer(4);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.isEmpty());
    }
}
