import myPackage.Circle;
import myPackage.Rectangle;
import myPackage.ShapeTest;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        // Create an ArrayList of Rectangle objects
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());

        // Create an ArrayList of Circle objects
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle());
        circles.add(new Circle());

        // Test the generic method with ArrayLists of different shapes
        ShapeTest.drawShapes(rectangles);
        ShapeTest.drawShapes(circles);
    }
}
