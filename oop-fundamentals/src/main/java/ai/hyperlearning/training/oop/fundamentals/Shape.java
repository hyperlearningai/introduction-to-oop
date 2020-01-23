package ai.hyperlearning.training.oop.fundamentals;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Shape Abstract Class
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

public abstract class Shape extends Frame {

    private Color colour;
    private int lineThickness;
    private int polygonWidth;
    private int polygonHeight;
    private int startX;
    private int startY;

    // Default Constructor
    public Shape() {

    }

    // Getter and Setter Methods
    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public int getLineThickness() {
        return lineThickness;
    }

    public void setLineThickness(int lineThickness) {
        this.lineThickness = lineThickness;
    }

    public int getPolygonWidth() {
        return polygonWidth;
    }

    public void setPolygonWidth(int polygonWidth) {
        this.polygonWidth = polygonWidth;
    }

    public int getPolygonHeight() {
        return polygonHeight;
    }

    public void setPolygonHeight(int polygonHeight) {
        this.polygonHeight = polygonHeight;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    // Other Methods
    public void display() {
        this.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent we) {
                        System.exit(0);
                    }
                });
        this.setSize(400, 400);
        this.setVisible(true);
    }

    // Abstract method to paint a shape
    public abstract void paint(Graphics graphics);

}
