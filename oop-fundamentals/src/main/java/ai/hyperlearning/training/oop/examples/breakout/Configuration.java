package ai.hyperlearning.training.oop.examples.breakout;

/**
 * Global Configuration
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

public class Configuration {

    // Display
    public static final String PLAYER_SELECTION_TITLE = "Breakout Player Selection";
    public static final String PLAYER_SELECTION_LABEL_TEXT = "Select your Player: ";
    public static final String PLAYER_SELECTION_OK_TEXT = "OK";
    public static final String GAME_TITLE = "Breakout";
    public static final String GAME_OVER = "Game Over!";
    public static final String GAME_OVER_VICTORY = "Victory!";
    public static final String BALL_IMAGE_PREFIX = "ball-";
    public static final String BALL_IMAGE_FILE_EXTENSION = ".png";
    public static String BALL_IMAGE_FILENAME = "ball-default.png";
    public static final String BRICK_IMAGE_FILENAME = "brick.png";
    public static final String PADDLE_IMAGE_FILENAME = "paddle.png";

    // Dimensions and Quantities
    public static final int WIDTH = 300;
    public static final int HEIGHT = 400;
    public static final int BOTTOM_EDGE = 390;
    public static final int NUMBER_OF_BRICKS = 30;
    public static final int INIT_PADDLE_X = 200;
    public static final int INIT_PADDLE_Y = 360;
    public static final int INIT_BALL_X = 230;
    public static final int INIT_BALL_Y = 355;
    public static final int PERIOD = 10;

    // Players
    public static final String[] PLAYERS = {
            "Default", "Danielle", "Gavin", "Jack", "Jillur", "Josie", "Lisa" };

}
