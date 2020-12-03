package main.java.entities.tile;


import main.java.entities.Entity;
import main.java.graphics.Sprite;

public class GrassTile extends Tile {

    public GrassTile(int x, int y, Sprite sprite) {
        super(x, y, sprite);
    }

    @Override
    public boolean collide(Entity e) {
        return true;
    }
}
