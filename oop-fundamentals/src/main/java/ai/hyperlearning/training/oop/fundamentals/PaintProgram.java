package ai.hyperlearning.training.oop.fundamentals;

import java.awt.*;

/**
 * Paint Program
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

public class PaintProgram {

    public static void main(String[] args) {

        // Create a circle instance and draw it
        Circle circle = new Circle();
        circle.setColour(Color.RED);
        circle.setLineThickness(10);
        circle.setPolygonWidth(100);
        circle.setPolygonHeight(100);
        circle.setStartX(150);
        circle.setStartY(150);
        circle.display();

        // Create a rectangle instance and draw it
        Rectangle rectangle = new Rectangle();
        rectangle.setColour(Color.BLUE);
        rectangle.setLineThickness(5);
        rectangle.setPolygonWidth(100);
        rectangle.setPolygonHeight(100);
        rectangle.setStartX(150);
        rectangle.setStartY(150);
        rectangle.display();

    }

}
