import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Snake";
        config.width = 800;
        config.height = 600;
        config.forceExit = true;
        config.foregroundFPS = 60;

        new LwjglApplication(new SnakeGame(), config);
    }
}
