package Proporties.Polymorphism;

public class Shapes {
    public static void main(String[] args) {
        Area a = new Area();
        a.area();
        Area sq = new Square();
        sq.area();
//        Rectangle rec = new Rectangle();
//        rec.area();
//        sq.arealen(2);//this be hepen in compile time to choose when
//        rec.arealen(2,3);// method overloading same name but differnt  may be type return type argumnet order etch

        sq.hi();
    }
}
