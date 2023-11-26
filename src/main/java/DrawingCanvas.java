import shapes.Circle;
import shapes.Rect;
import shapes.Shape;
import shapes.Square;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class DrawingCanvas extends Canvas {
    private final ArrayList<Shape> shapes = new ArrayList<>();
    public void clearShapes() {
        shapes.clear();
        repaint();
    }
    public DrawingCanvas(ControlPanel controlPanel) {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(500, 500));

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Color color = controlPanel.getCurrentColor();
                String currentShape = controlPanel.getCurrentShape();
                int size = controlPanel.getCurrentSize();

                if ("Circle".equals(currentShape)) {
                    Circle circle = new Circle(size, e.getPoint(), color);
                    shapes.add(circle);
                } else if ("Rectangle".equals(currentShape)) {
                    Rect rect = new Rect(2*size, size, e.getPoint(), color);
                    shapes.add(rect);
                } else if ("Square".equals(currentShape)) {
                    Square square = new Square(size, size, e.getPoint(), color);
                    shapes.add(square);
                }
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        for (Shape shape : shapes){
            shape.draw(g);
        }
    }
}
