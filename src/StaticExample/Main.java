package StaticExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        // Creating Human object
        // population is NOT passed because it is static
        // Constructor automatically increments population
        Human arun = new Human("arun", 7, 345.90f);

        // Best practice: access static variable using class name
        System.out.println(Human.population);
    }

    /*
     * RULE:
     * Static method cannot directly call non-static method
     * because non-static methods require an object
     */

    // static void fun() {
    //     greet();   // ❌ NOT allowed (compile-time error)
    // }

    /*
     * Non-static method
     * Object is required to call this method
     */
    void greet() {
        System.out.println("hi");
    }

    /*
     * Another non-static method
     */
    void fun2() {
        System.out.println("fun");
    }

    /*
     * Static method
     * To call non-static method, object must be created
     */
    static void fun() {

        // Creating object inside static method
        Main obj = new Main();

        // Calling non-static method using object
        obj.fun2();
    }
}
//STATIC KEY POINTS:
//
//        1. Static variable belongs to the class, not object
//2. Only ONE copy of static variable exists
//3. All objects share the same static variable
//4. Access static variable using ClassName.variable
//5. Static method cannot access non-static members directly
//6. Non-static method can access static members
//7. To call non-static from static → create object
