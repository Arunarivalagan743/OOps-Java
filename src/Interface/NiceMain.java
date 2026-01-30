package Interface;

public class NiceMain {
    public static void main(String[] args) {
        NiceCar car = new NiceCar(
                new PowerEngine(),
                new CDplayer()
        );
        car.start();
        car.musicStart();
        car.engine();
        car.start();
    }
}
