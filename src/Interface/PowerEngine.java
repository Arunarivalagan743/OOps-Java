package Interface;

public class PowerEngine implements  Engine{
    @Override
    public void Start() {
        System.out.println("engine strts");
    }

    @Override
    public void Stop() {
        System.out.println("engine stops");
    }
}
