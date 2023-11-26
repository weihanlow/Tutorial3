package shapes;

import java.awt.*;

public class Rect extends Shape{
    private final int width;
    private final int height;

    public Rect(int width, int height, Point position, Color color) {
        super(position, color);
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(position.x, position.y, width, height);
    }
}
