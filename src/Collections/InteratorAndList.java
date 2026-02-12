package Collections;

import java.util.*;

public class InteratorAndList {
    public static void main(String[] args) {
        List <Integer>  a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(8);
        List <Integer> b  = new ArrayList<>();
        b.add(3);
        ListIterator<Integer> it = a.listIterator(a.size());

        while (it.hasPrevious())
        {
            System.out.println(it.previous());
        }
        a.set(2,7);
        a.addAll(b);
        System.out.println(a.indexOf(6));

    }
}
