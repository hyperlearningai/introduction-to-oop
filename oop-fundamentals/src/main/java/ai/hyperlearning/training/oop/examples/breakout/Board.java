package ai.hyperlearning.training.oop.examples.breakout;

import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Breakout Canvas
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

public class Board extends JPanel {

    private Timer timer;
    private String message = Configuration.GAME_OVER;
    private Ball ball;
    private Paddle paddle;
    private Brick[] bricks;
    private boolean inGame = true;

    // Default Constructor
    public Board() {
        initBoard();
    }

    // Initialise the Canvas
    private void initBoard() {
        addKeyListener(new TAdapter());
        setFocusable(true);
        setPreferredSize(new Dimension(Configuration.WIDTH, Configuration.HEIGHT));
        setBackground(new Color(255, 252, 251));
        gameInit();
    }

    // Initialise the sprites and timers
    private void gameInit() {

        // Initialise the sprites
        bricks = new Brick[Configuration.NUMBER_OF_BRICKS];
        ball = new Ball();
        paddle = new Paddle();

        // Create the Brick objects
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                bricks[k] = new Brick(j * 40 + 30, i * 10 + 50);
                k++;
            }
        }

        // Initialise and start a timer
        timer = new Timer(Configuration.PERIOD, new GameCycle());
        timer.start();

    }

    /**
     * Initialise the 2D canvas and draw the sprites
     * @param g
     */

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Initialise the 2D Canvas
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        // Draw the sprites if still in-game
        if (inGame)
            drawObjects(g2d);
        else
            gameFinished(g2d);
        Toolkit.getDefaultToolkit().sync();

    }

    /**
     * Draw sprites as images to be rendered on the canvas
     * @param g2d
     */

    private void drawObjects(Graphics2D g2d) {

        // Draw the Ball object
        g2d.drawImage(ball.getImage(), ball.getX(), ball.getY(),
                ball.getImageWidth(), ball.getImageHeight(), this);

        // Draw the Paddle object
        g2d.drawImage(paddle.getImage(), paddle.getX(), paddle.getY(),
                paddle.getImageWidth(), paddle.getImageHeight(), this);

        // Draw all the non-destroyed Brick objects
        for (int i = 0; i < Configuration.NUMBER_OF_BRICKS; i++) {
            if (!bricks[i].isDestroyed()) {
                g2d.drawImage(bricks[i].getImage(), bricks[i].getX(),
                        bricks[i].getY(), bricks[i].getImageWidth(),
                        bricks[i].getImageHeight(), this);
            }
        }

    }

    /**
     * Display a string when the game finishes
     * @param g2d
     */

    private void gameFinished(Graphics2D g2d) {
        Font font = new Font("Arial", Font.BOLD, 20);
        FontMetrics fontMetrics = this.getFontMetrics(font);
        g2d.setColor(Color.BLACK);
        g2d.setFont(font);
        g2d.drawString(message,
                (Configuration.WIDTH - fontMetrics.stringWidth(message)) / 2,
                Configuration.WIDTH / 2);
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            paddle.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            paddle.keyPressed(e);
        }

    }

    private class GameCycle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            doGameCycle();
        }

    }

    private void doGameCycle() {
        ball.move();
        paddle.move();
        checkCollision();
        repaint();
    }

    private void stopGame() {
        inGame = false;
        timer.stop();
    }

    // Collision-driven events
    private void checkCollision() {

        // If the ball hits the bottom of the canvas then game over
        if (ball.getRect().getMaxY() > Configuration.BOTTOM_EDGE)
            stopGame();

        // If all bricks have been 'destroyed' then game over
        for (int i = 0, j = 0; i < Configuration.NUMBER_OF_BRICKS; i++) {
            if (bricks[i].isDestroyed())
                j++;
            if (j == Configuration.NUMBER_OF_BRICKS) {
                message = Configuration.GAME_OVER_VICTORY;
                stopGame();
            }
        }

        // If the ball hits the paddle
        if ((ball.getRect()).intersects(paddle.getRect())) {

            // Get the position of both objects in the x-plane
            int paddleLPos = (int) paddle.getRect().getMinX();
            int ballLPos = (int) ball.getRect().getMinX();

            int first = paddleLPos + 8;
            int second = paddleLPos + 16;
            int third = paddleLPos + 24;
            int fourth = paddleLPos + 32;

            if (ballLPos < first) {
                ball.setXDir(-1);
                ball.setYDir(-1);
            }

            if (ballLPos >= first && ballLPos < second) {
                ball.setXDir(-1);
                ball.setYDir(-1 * ball.getYDir());
            }

            if (ballLPos >= second && ballLPos < third) {
                ball.setXDir(0);
                ball.setYDir(-1);
            }

            if (ballLPos >= third && ballLPos < fourth) {
                ball.setXDir(1);
                ball.setYDir(-1 * ball.getYDir());
            }

            if (ballLPos > fourth) {
                ball.setXDir(1);
                ball.setYDir(-1);
            }
        }

        // If the ball object hits a brick object
        for (int i = 0; i < Configuration.NUMBER_OF_BRICKS; i++) {

            if ((ball.getRect()).intersects(bricks[i].getRect())) {

                int ballLeft = (int) ball.getRect().getMinX();
                int ballHeight = (int) ball.getRect().getHeight();
                int ballWidth = (int) ball.getRect().getWidth();
                int ballTop = (int) ball.getRect().getMinY();

                Point pointRight = new Point(ballLeft + ballWidth + 1, ballTop);
                Point pointLeft = new Point(ballLeft - 1, ballTop);
                Point pointTop = new Point(ballLeft, ballTop - 1);
                Point pointBottom = new Point(ballLeft, ballTop + ballHeight + 1);

                if (!bricks[i].isDestroyed()) {

                    if (bricks[i].getRect().contains(pointRight))
                        ball.setXDir(-1);
                    else if (bricks[i].getRect().contains(pointLeft))
                        ball.setXDir(1);

                    if (bricks[i].getRect().contains(pointTop))
                        ball.setYDir(1);
                    else if (bricks[i].getRect().contains(pointBottom))
                        ball.setYDir(-1);

                    bricks[i].setDestroyed(true);

                }

            }

        }

    }

}
