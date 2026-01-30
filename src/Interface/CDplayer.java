package Interface;

public class CDplayer implements Media{
    @Override
    public void Start() {
        System.out.println("music starts");

    }

    @Override
    public void Stop() {
        System.out.println("music stops");
    }
}
