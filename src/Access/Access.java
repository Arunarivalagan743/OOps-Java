package Access;

public class Access {
protected    int n;
   private  String name;
    int a[];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Access(int n, String name) {
        this.n = n;
        this.name = name;
        this.a = new int[n];
    }
}
