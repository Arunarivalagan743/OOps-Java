package Access;

public class Main {
    public static void main(String[] args) {
        Access a = new Access(10,"arun");
        int k = a.n;//public means
        System.out.println(a.getName());// if private it through by getter seeter
        System.out.println(a instanceof Access);
        System.out.println(a.getName());

    }
}
