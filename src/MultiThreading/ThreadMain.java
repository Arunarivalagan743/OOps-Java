package MultiThreading;

class My extends Thread {
    public  void run()
    {
        for (int i = 0; i < 5; i++) {
            try{
                System.out.println("Hi  "+ i);
                My.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadMain {
    public static void main(String[] args) {
        My  t = new My();

        t.start();
    }
}
class LambdaDemo {
    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            System.out.println("Lambda Thread Running");
        });

        t.start();
    }
}
interface MyInterface {
    void show();
}

 class Test {
    public static void main(String[] args) {

        MyInterface obj = () -> {
            System.out.println("Lambda Using Functional Interface");
        };

        obj.show();
    }
}