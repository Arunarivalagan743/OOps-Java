package Introduction;

// Demonstrates how a final variable can be initialized in a constructor
class DemoFinal {

    // Blank final variable
    // A final variable must be initialized exactly once
    final int a;

    // Constructor is used to initialize the final variable
    DemoFinal() {
        a = 89;  // initialization is allowed here
    }
}



public class Final {
    public static  void greet()
    {
        System.out.println("class form package introdutcion");
    }
    public static void main(String[] args) {

        // 'arun' is a final reference to a Student object
        // The reference cannot be reassigned to another object
        final Student arun = new Student();

        // Modifying the internal state of the object is allowed
        // because Student is a mutable class
        arun.roll = 98;
        arun.roll = 67;

        // Creating another Student object
        Student hari = new Student();

        // Reassigning 'arun' is NOT allowed because it is final
        // arun = hari;  // ❌ Compile-time error

        // Assigning 'hari' to point to the same object as 'arun' is allowed
        hari = arun;

        // Since both references point to the same object,
        // the value of roll will be the same
        System.out.println(hari.roll); // Output: 67
    }
}
