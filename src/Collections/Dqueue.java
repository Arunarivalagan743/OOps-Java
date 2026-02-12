package Collections;


import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class Dqueue {
    public static void main(String[] args) {

        Deque<Integer> d = new ArrayDeque<>();


        d.addFirst(5);
        d.addFirst(56);
        d.addLast(20);

d.addLast(578);
        System.out.println(d);
        d.removeFirst();
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());

        System.out.println(d);
int a[] = {1,2,2,2,25};
        System.out.println(Arrays.toString(Arrays.stream(a).distinct().toArray()
        ));

    }
}
