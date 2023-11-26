package shapes;

import java.awt.*;

public abstract class Shape implements Drawable{
    protected final Point position;
    protected final Color color;

    public Shape(Point position, Color color) {
        this.position = position;
        this.color = color;
    }
}
