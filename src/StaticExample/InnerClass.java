package StaticExample;

// Outer class
public class InnerClass {

    String outerName;

    // Constructor of outer class
    public InnerClass(String outerName) {
        this.outerName = outerName;
    }

    /*
     * NON-STATIC INNER CLASS
     * This class DEPENDS on the outer class object
     */
    class InnerTest {

        String name;

        public InnerTest(String name) {
            this.name = name;
        }

        void display() {
            System.out.println("Inner name: " + name);
            System.out.println("Outer name: " + outerName);
        }
    }

    public static void main(String[] args) {

        // Step 1: Create outer class object
        InnerClass outerObj = new InnerClass("arun");

        // Step 2: Create inner class object using outer object
        InnerClass.InnerTest innerObj =
                outerObj.new InnerTest("hari");

        // Step 3: Call inner class method
        innerObj.display();
    }
}
