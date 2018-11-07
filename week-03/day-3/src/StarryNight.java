import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        StarryNight(graphics);
    }
    public static void StarryNight (Graphics graphics){
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0, WIDTH, HEIGHT);
        int numberOfStars = (int)(Math.random()*50)+50;
        for (int i = 0; i < numberOfStars; i++){
            int rgbValue = (int)(Math.random()*256);
            int sqSize = (int)(Math.random()*10);
            int xPoint = (int)(Math.random()*(WIDTH-sqSize+1));
            int yPoint = (int)(Math.random()*(HEIGHT-sqSize+1));
            Color starColor = new Color (rgbValue, rgbValue, rgbValue);
            graphics.setColor(starColor);
            graphics.fillRect(xPoint,yPoint,sqSize,sqSize);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}