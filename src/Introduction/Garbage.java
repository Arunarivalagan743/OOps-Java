package Introduction;

import java.util.Arrays;

class GarbageColl {
    String name;

    GarbageColl(String name) {
        System.out.println("Object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        // This method MAY be called by the Garbage Collector
        // It is NOT guaranteed to execute
        // Memory is freed by the JVM after the object becomes unreachable
        System.out.println("Object destroyed");
    }
}

public class Garbage {
    public static void main(String[] args) {

        GarbageColl a1 = new GarbageColl("arun");

        // Each iteration creates a new object
        // The old object becomes unreachable and eligible for GC
        for (int i = 0; i < 1_000_000_000; i++) {
            a1 = new GarbageColl("hari");
        }

        // Program end
        // Garbage Collection may or may not run before program exits
        System.out.println("End of main");
    }
}