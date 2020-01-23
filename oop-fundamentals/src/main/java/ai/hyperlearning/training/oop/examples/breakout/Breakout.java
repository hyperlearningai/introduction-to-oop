package ai.hyperlearning.training.oop.examples.breakout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Breakout Main Program including Player Selection
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

public class Breakout extends JFrame {

    // Start the Game
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                // Initialise the player selection JFrame
                Breakout playerSelectionFrame = new Breakout();
                playerSelectionFrame.setSize(600, 100);
                playerSelectionFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
                playerSelectionFrame.setTitle(Configuration.PLAYER_SELECTION_TITLE);

                // Create a label
                JLabel label = new JLabel();
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setText(Configuration.PLAYER_SELECTION_LABEL_TEXT);

                // Create a player selection combo-box and its listener
                JComboBox<String> playerList = new JComboBox<>(Configuration.PLAYERS);
                playerList.setSelectedIndex(0);
                playerList.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JComboBox comboBox = (JComboBox) e.getSource();
                        String playerName = (String) comboBox.getSelectedItem();
                        Configuration.BALL_IMAGE_FILENAME = Configuration.BALL_IMAGE_PREFIX
                                + playerName.toLowerCase() + Configuration.BALL_IMAGE_FILE_EXTENSION;
                    }
                });

                // Create the OK button
                JButton okButton = new JButton(Configuration.PLAYER_SELECTION_OK_TEXT);
                okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        // Hide the player selection JFrame
                        playerSelectionFrame.setVisible(false);

                        // Start the Breakout Game JFrame
                        JFrame breakout = new JFrame();
                        breakout.add(new Board());
                        breakout.setTitle(Configuration.GAME_TITLE);
                        breakout.setDefaultCloseOperation(EXIT_ON_CLOSE);
                        breakout.setLocationRelativeTo(null);
                        breakout.setResizable(false);
                        breakout.pack();
                        breakout.setVisible(true);

                    }

                });

                // Add the components to the player selection JFrame
                playerSelectionFrame.add(label);
                playerSelectionFrame.add(playerList);
                playerSelectionFrame.add(okButton);
                playerSelectionFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                playerSelectionFrame.setLocationRelativeTo(null);
                playerSelectionFrame.setVisible(true);

            }

        });

    }

}
