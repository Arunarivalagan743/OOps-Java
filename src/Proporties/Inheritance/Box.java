package Proporties.Inheritance;

public class Box {
    double h;
    double l;
    double w;
    double weight;

    public Box(double h, double l, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }
    public Box() {
        this.h = h;
        this.l = l;
        this.w = w;
    }
    public Box(Box old) {
        this.h = h;
        this.l = l;
        this.w = w;
    }
    public void parent()
    {
        System.out.println("parent super");
    }
}
