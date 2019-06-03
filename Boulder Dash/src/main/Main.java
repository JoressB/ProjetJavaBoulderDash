package main;

import javax.swing.*;

import controller.NavigationBetweenViewController;


/**
 * Game
 *
 * Spawns the game.
 *
 * @author      Joress BADIENGUISSA
 * @since       25-05-2019
 */
public class Main {
    /**
     * Class constructor
     *
     * @param  args  Command-line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NavigationBetweenViewController();
            }
        });
    }
}
