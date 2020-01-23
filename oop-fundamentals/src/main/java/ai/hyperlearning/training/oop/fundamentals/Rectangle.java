package ai.hyperlearning.training.oop.fundamentals;

import java.awt.*;

/**
 * Rectangle Class
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

public class Rectangle extends Shape {

    @Override
    public void paint(Graphics graphics) {
        Graphics2D canvas = (Graphics2D) graphics;
        canvas.setPaint(super.getColour());
        canvas.setStroke(new BasicStroke(super.getLineThickness()));
        canvas.fillRect(super.getStartX(), super.getStartY(), super.getPolygonWidth(), super.getPolygonHeight());
    }

}
