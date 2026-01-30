package Comaparable;

public class Student implements Comparable<Student>{
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        int d = (int) o.roll - this.roll;
        return d;
    }
}
