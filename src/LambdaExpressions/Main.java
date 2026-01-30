package LambdaExpressions;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1️ Lambda with forEach
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            al.add(i);
        }

        // forEach uses Consumer<T>
        al.forEach(k -> System.out.println(k * 2));

        // 2️Lambda with custom functional interface
        operation add = (a, b) -> a + b;
        operation mul = (a, b) -> a * b;
        operation sub = (a, b) -> a - b;

        // calling lambda expressions
        System.out.println(add.op(10, 5)); // 15
        System.out.println(mul.op(10, 5)); // 50
        System.out.println(sub.op(10, 5)); // 5
    }
}

// Functional Interface
interface operation {
    int op(int a, int b);
}
