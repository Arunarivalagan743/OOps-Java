package StaticExample;

public class Human {

    // Non-static variables → each object has its own copy
    String name;
    int age;
    float salary;

    // Static variable → belongs to the class, shared by all objects
    static int population;

    // Constructor → runs every time an object is created
    public Human(String name, int age, float salary) {

        // 'this' refers to current object
        this.name = name;
        this.age = age;
        this.salary = salary;

        // Static variable accessed using class name
        // Increases population count whenever a Human object is created
        Human.population += 1;
    }
}
