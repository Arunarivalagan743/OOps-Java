package Proporties.Abstarction;

public  abstract  class Carrer {

    public Carrer(int a) {
        this.a = a;
    }
   public  static void  fun()
   {
       System.out.println("i am static ");
   }
    void sum()
   {
       System.out.println("i am sum of two");
   }
    int a;

    abstract  public  void carrer();
    abstract public void partner();
}
