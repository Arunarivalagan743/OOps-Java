package Introduction;

class Student {
    int roll;
    String name;
    float marks;

    void greet() {
        System.out.println("hello" + this.name);
    }

    Student() {
        this.name = "arun";
        this.roll = 14;
        this.marks = 65.7f;
    }

    Student(int roll, String name, float marks) {
        this.roll = roll; //object.roll = parameter roll

        roll = roll; //Both roll refer to the constructor parameter

//        The instance variable is hidden
//
//        So you are doing:
        this.name = name;  //this is used to differentiate instance variables from local variables when they have the same name.
        this.marks = marks;
    }

}

public class Main {

    public static void main(String[] args) {
        Student s1; //decalring to create reference to in  the stack to the object as default null
//        s1 = new Student();
//        s1.roll =13;
//        s1.name = "arun";
//        System.out.println(s1.name);

        //as no argumnet constructor
//        s1 = new Student();
//    s1.greet();
//        System.out.println(s1.name);
//        System.out.println(s1.roll);
//        System.out.println(s1.marks);

        s1 = new Student(14, "sakthi", 78f);
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.marks);
    }
}
