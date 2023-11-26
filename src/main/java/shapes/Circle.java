package shapes;

import java.awt.*;

public class Circle extends Shape {
    private final int radius;

    public Circle(int radius, Point position, Color color){
        super(position, color);
        this.radius = radius;
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(position.x - radius, position.y - radius, radius*2, radius*2);
    }
}
