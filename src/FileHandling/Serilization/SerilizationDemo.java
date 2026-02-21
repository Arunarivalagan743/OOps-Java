package FileHandling.Serilization;

import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerilizationDemo {
    public static void main(String[] args) throws Exception {

        Student s = new Student(1, "Arun");

        FileOutputStream fos = new FileOutputStream("student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s);
        oos.close();

        System.out.println("Object Serialized");
    }
}


 class DeserializeDemo {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student) ois.readObject();
        ois.close();

        System.out.println(s.id + " " + s.name);
    }
}