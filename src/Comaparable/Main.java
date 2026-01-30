package Comaparable;

public class Main {
    public static void main(String[] args) {
        Student a = new Student(89,"arun");
        Student b  = new Student(45,"hari");
        if(a.compareTo(b) > 0)
        {
            System.out.println(a.compareTo(b));
            System.out.println("a win");
        }else{
            System.out.println("b win");
        }
    }
}
