import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int dividend = 8;
        checkerboard(dividend, graphics);
    }
    public static void checkerboard(int number, Graphics graphics){
    int sqSide = WIDTH/number;
        for (int i = 0; i < number; i++){
            for (int j = 0; j < number; j++){
                if ((i+j)%2 == 0) {
                    graphics.setColor(Color.BLACK);
                } else  {
                    graphics.setColor(Color.white);
                }
                graphics.fillRect(j*sqSide, i*sqSide, sqSide, sqSide);
            }
        }
        return;
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