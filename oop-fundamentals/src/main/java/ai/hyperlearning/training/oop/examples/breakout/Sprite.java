package ai.hyperlearning.training.oop.examples.breakout;

import java.awt.Image;
import java.awt.Rectangle;

/**
 * General Computer Graphic/Sprite Class
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

public class Sprite {

    protected int x;
    protected int y;
    protected int imageWidth;
    protected int imageHeight;
    protected Image image;

    /*****************************************************************************************************************
     * FIX: Create getter and setter methods for each of the attributes encapsulated by this superclass
     ****************************************************************************************************************/










    public Rectangle getRect() {
        return new Rectangle(x, y,
                image.getWidth(null), image.getHeight(null));
    }

    public void getImageDimensions() {
        imageWidth = image.getWidth(null);
        imageHeight = image.getHeight(null);
    }

}
