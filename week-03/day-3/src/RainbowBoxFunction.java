import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        int size = 10;
        Color startingcolor = Color.BLACK;
        Color asd = new Color(1, 2, 3);
        for (int i = 0; i <= WIDTH; i++){
            if (i == 0){
                RainbowBox(size, startingcolor, graphics, true);
                i += size;
            }else {
                Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
                RainbowBox(i, color, graphics, false);
            }
        }
    }
    public static void RainbowBox (int sqSide, Color color, Graphics graphics, boolean isInit){
        graphics.setColor(color);
        if (isInit){
            graphics.fillRect((WIDTH / 2 - sqSide / 2), (HEIGHT / 2 - sqSide / 2), sqSide, sqSide);
        } else {
            graphics.drawRect((WIDTH / 2 - sqSide / 2), (HEIGHT / 2 - sqSide / 2), sqSide, sqSide);
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