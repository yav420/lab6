package geometry2d;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle implements Figure {

    private final double radius;
    private final double x;
    private final double y;
    private final Color color;

    public Circle(double radius, double x, double y, Color color) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(x, y, radius * 2, radius * 2);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Круг с радиусом: " + area();
    }
}