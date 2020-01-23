package ai.hyperlearning.training.oop.examples.breakout;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 * Paddle Class
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

/**********************************************************************************************************************
 * FIX: Update this class to be a subclass of the Sprite superclass
 *********************************************************************************************************************/

public class Paddle  {

    // Delta in the x-plane
    private int dx;

    // Default Constructor
    public Paddle() {

        /**************************************************************************************************************
         * FIX: Update the default constructor of this subclass to perform the following operations:
         *        1. Invoke the loadImage() method
         *        2. Invoke the getImageDimensions() method
         *        3. Invoke the resetState() method
         *************************************************************************************************************/










    }

    // Load the image of the Paddle
    private void loadImage() {

        /**************************************************************************************************************
         * FIX: Load the image of a Paddle for instances of this subclass
         * HINT: Use the loadImage() method from the Ball class as a template!
         *************************************************************************************************************/





    }

    // Move the Paddle in the x-plane
    void move() {
        x += dx;
        if (x <= 0)
            x = 0;
        if (x >= Configuration.WIDTH - imageWidth)
            x = Configuration.WIDTH - imageWidth;
    }

    // Set the delta in the x-plane based on which key was pressed (i.e. left or right key)
    void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT)
            dx = -1;
        if (key == KeyEvent.VK_RIGHT)
            dx = 1;
    }

    // Reset the delta when the key has been released
    void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT)
            dx = 0;
        if (key == KeyEvent.VK_RIGHT)
            dx = 0;
    }

    // Reset the (x,y) position of the paddle
    private void resetState() {
        x = Configuration.INIT_PADDLE_X;
        y = Configuration.INIT_PADDLE_Y;
    }

}
