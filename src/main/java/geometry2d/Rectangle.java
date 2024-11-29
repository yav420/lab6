package geometry2d;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle implements Figure {

    private final double width;
    private final double height;
    private final double x;
    private final double y;
    private final Color color;

    public Rectangle(double width, double height, double x, double y, Color color) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillRect(x, y, width, height);
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Прямоугольник площадью: " + area();
    }
}
