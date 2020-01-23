package ai.hyperlearning.training.oop.examples.breakout;

import javax.swing.ImageIcon;

/**
 * Ball Class
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

public class Brick extends Sprite {

    // Flag as to whether the brick has been destroyed or not
    private boolean destroyed;

    // Non-Default constructor to create a Brick object at co-ordinates (x,y)
    public Brick(int x, int y) {
        initBrick(x, y);
    }

    // Create a Brick object at co-ordinates (x,y) and set default attributes
    private void initBrick(int x, int y) {
        this.x = x;
        this.y = y;
        destroyed = false;
        loadImage();
        getImageDimensions();
    }

    // Load the image of the Brick
    private void loadImage() {

        /**************************************************************************************************************
         * FIX: Load the image of a Brick for instances of this subclass
         * HINT: Use the loadImage() method from the Ball class as a template!
         *************************************************************************************************************/






    }

    // Query whether the Brick instance has been destroyed
    public boolean isDestroyed() {
        return destroyed;
    }

    // Method to destroy the Brick instance
    public void setDestroyed(boolean status) {
        destroyed = status;
    }

}
