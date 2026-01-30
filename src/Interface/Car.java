package Interface;

public class Car implements Break,Engine,Media {
    @Override
    public void Start() {
        System.out.println("engine starts");
    }

    @Override
    public void Stop() {
        System.out.println("engine stops");
    }




}
