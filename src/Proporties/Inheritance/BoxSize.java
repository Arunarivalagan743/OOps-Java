package Proporties.Inheritance;

public class BoxSize extends BoxWeight {
    int s ;
    public BoxSize()
    {
        super();
        this.s =  s;
    }
    public BoxSize(int size,double weight)
    {
        super(weight);
        this.s =size;
    }
    public BoxSize(double h, double l, double w,double weight,int size)
    {
        super(h,l,w,weight);
        this.s =   size;
    }
}
