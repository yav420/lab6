package geometry2d;

import javafx.scene.canvas.GraphicsContext;

public interface Figure {
    double area();
    void draw(GraphicsContext graphicsContext);
}
