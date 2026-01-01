package Introduction;

public class Wrapper {

    public static void main(String[] args) {

        // Wrapper class objects
        Integer a = 10;
        Integer b = 20; //It is immutable and internally is final

        // Calling method to swap wrapper objects
        swapWrapperObject(a, b);

        System.out.println("After swapping wrapper objects in main:");

        // Output will NOT be swapped
        // Reason:
        // Java is pass-by-value.
        // For objects, a COPY of the reference is passed.
        // Swapping references inside the method does NOT affect main().
        // Also, Integer is IMMUTABLE, so its value cannot be changed.
        System.out.println(a + " " + b);


        /*
        // Primitive data type example
        int a = 10;
        int b = 20;

        // Calling method to swap primitive values
        swapPrimitive(a, b);

        System.out.println("After swapping primitive values in main:");

        // Output will NOT be swapped
        // Reason:
        // Primitive values are passed by value (copy of data).
        // Changes inside the method affect only local variables.
        System.out.println(a + " " + b);
        */
    }

    // Method to swap primitive values
    static void swapPrimitive(int a, int b) {

        // Swapping happens only for local copies
        int t = a;
        a = b;
        b = t;

        System.out.println("Swapping primitive values inside method:");
        System.out.println(a + " " + b);
    }

    // Method to swap wrapper class objects
    static void swapWrapperObject(Integer a, Integer b) {

        // Only local references are swapped
        // Original references in main() remain unchanged
        Integer t = a;
        a = b;
        b = t;

        System.out.println("Swapping wrapper objects inside method:");
        System.out.println(a + " " + b);
    }
}
