package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


/**
 * MenuImage
 *
 * Specifies the menu image
 *
 * @author		Joress BADIENGUISSA 
 * @since       2015-06-23
 */
public class MenuImage extends JPanel {
    private BufferedImage imageFile;
    private String imagePath = "./sprites/menu_actual.jpg";

    /**
     * Class constructor
     */
    public MenuImage() {
        try {
            this.imageFile = ImageIO.read(new File(this.imagePath));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Paints the component itself
     *
     * @param  g  Graphics element
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(this.imageFile, 0, 0, null);
    }
}