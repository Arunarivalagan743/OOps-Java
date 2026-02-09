package Cloning;



public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
       Clone a =  new Clone("Ar",6);
       Clone b =  (Clone) a.clone();// shallow copy
        System.out.println(b.name);
    }
}
