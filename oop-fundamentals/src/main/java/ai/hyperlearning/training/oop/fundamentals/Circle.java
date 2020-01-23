package ai.hyperlearning.training.oop.fundamentals;

import java.awt.*;

/**
 * Circle Class
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

public class Circle extends Shape {

    @Override
    public void paint(Graphics graphics) {
        Graphics2D canvas = (Graphics2D) graphics;
        canvas.setPaint(super.getColour());
        canvas.setStroke(new BasicStroke(super.getLineThickness()));
        canvas.drawOval(super.getStartX(), super.getStartY(), super.getPolygonWidth(), super.getPolygonHeight());
    }

}
