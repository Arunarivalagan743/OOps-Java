package Interface;

import Interface.Engine;
import Interface.Media;

public class NiceCar {

    private Engine engine;
    private Media music;

    public NiceCar(Engine engine, Media music) {
        this.engine = engine;
        this.music = music;
    }

    public void start() {
        engine.Start();
    }

    public void musicStart() {
        music.Start();
    }
    public void engine()
    {
        this.engine = new ElectricEngine();
    }
}
