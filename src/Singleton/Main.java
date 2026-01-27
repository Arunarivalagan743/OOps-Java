package Singleton;

import Access.Access;

public class Main {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b  = Singleton.getInstance();
//         Access k  = new Access(7,"ak");
//        System.out.println(k.n);
        if(a == b)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
