package Proporties.Inheritance;

public class BoxWeight extends  Box{
    double weight;

    public BoxWeight(double h, double l, double w, double wight) {
        super(h, l, w);
        super.weight = wight;// acces parent wight
        //this.weight is accese crt refrec object
    }

    public BoxWeight(double wight) {
        this.weight = wight;
    }

    public BoxWeight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }

    public BoxWeight() {

    }

    public void parent()
    {
        super.parent();
    }
}
