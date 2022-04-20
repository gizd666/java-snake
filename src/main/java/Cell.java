import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class Cell {
    private int x;
    private int y;
    private Texture texture;
    public Cell(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.texture = createTexture(Config.cellSize, Config.cellSize, color);
    }

    private Texture createTexture(int w, int h, Color color) {
        Pixmap pixmap = new Pixmap(w, h, Pixmap.Format.RGBA8888);
        pixmap.setColor(color);
        pixmap.fillRectangle(0, 0, w, h);
        Texture texture = new Texture(pixmap);
        pixmap.dispose();
        return texture;
    }

    public void draw(Batch batch) {
        batch.draw(this.texture, this.x * Config.cellSize, this.y * Config.cellSize, Config.cellSize, Config.cellSize);
    }
}
