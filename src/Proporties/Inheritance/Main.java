package Proporties.Inheritance;

import Access.Access;

public class Main {
    public static void main(String[] args) {
//        Box b1 =  new Box(6,4,3);
//        Box b2  =  new Box(b1);
////        b1.h = 9;
////        b1.l = 8;
////        b1.w = 4;
//        System.out.println(b1.w  + " " + b1.l+ " " + b1.h);
        Box b1 = new BoxWeight(4,5,6,7);
        BoxWeight b2 =  new BoxWeight(b1,988);
        System.out.println(b2.weight);
        b2.parent();
        BoxSize b3 = new BoxSize(1,2,3,4,5);
        // multi level inheritence
//         Access pr  = new Access(89,"arun");
//        System.out.println(pr.n);..protected
    }
}
