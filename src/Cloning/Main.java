package Cloning;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
       Clone a =  new Clone("Ar",6);
       Clone b =  (Clone) a.clone();
       // shallow copy
        b.arr[0] = 65;
        System.out.println(Arrays.toString(a.arr));
        System.out.println(Arrays.toString(b.arr));
    }
}
