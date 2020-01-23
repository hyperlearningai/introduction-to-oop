package ai.hyperlearning.training.oop.examples.breakout;

import javax.swing.ImageIcon;

/**
 * Ball Class
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

public class Ball extends Sprite {

    // Dynamic co-ordinates of the ball in the (x,y) plane
    private int xdir;
    private int ydir;

    // Default Constructor
    public Ball() {

        /**************************************************************************************************************
         * FIX: Update the default constructor of this subclass to perform the following operations:
         *        1. Set xdir to 1
         *        2. Set ydir to -1
         *        3. Invoke the loadImage() method
         *        4. Invoke the getImageDimensions() method
         *        5. Invoke the resetState() method
         *************************************************************************************************************/










    }

    // Load the image of the Ball
    private void loadImage() {
        ImageIcon imageIcon = new ImageIcon(
                getClass().getClassLoader().getResource(Configuration.BALL_IMAGE_FILENAME));
        image = imageIcon.getImage();
    }

    // Set the x-plane direction
    public void setXDir(int x) {
        xdir = x;
    }

    // Set the y-plane direction
    public void setYDir(int y) {
        ydir = y;
    }

    // Get the y-plane direction
    public int getYDir() {
        return ydir;
    }

    // Move the Ball in the (x,y) plane
    public void move() {
        x += xdir;
        y += ydir;
        if (x == 0)
            setXDir(1);
        if (x == Configuration.WIDTH - imageWidth)
            setXDir(-1);
        if (y == 0)
            setYDir(1);
    }

    // Reset the (x,y) position of the Ball
    private void resetState() {
        x = Configuration.INIT_BALL_X;
        y = Configuration.INIT_BALL_Y;
    }

}
