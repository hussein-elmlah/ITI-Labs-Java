package myPackage;

import java.util.List;

public class ShapeTest {
    // This method accepts a list containing only child classes of Shape
    public static void drawShapes(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
