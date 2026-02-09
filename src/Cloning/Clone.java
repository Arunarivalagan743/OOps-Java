package Cloning;

public class Clone implements  Cloneable {
    String name;
    int a;
    int[] arr;

    public Clone(String name, int a) {
        this.name = name;
        this.a = a;
        this.arr =  new int[]{10,20,30};
    }
    public  Object clone() throws CloneNotSupportedException {
        Clone b =  (Clone) super.clone();
        b.arr  =  new int[b.arr.length];

       for(int i  =0;i<b.arr.length;i++)
       {
           b.arr[i] =  this.arr[i];
       }
       return  b;
    }
}
