import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SnakeGame extends Game {

    private SpriteBatch batch;

    Cell cell1;

    @Override
    public void create() {
        batch = new SpriteBatch();
        cell1 = new Cell(0, 5, Color.BLUE);
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        cell1.draw(batch);
        batch.end();
    }


}
