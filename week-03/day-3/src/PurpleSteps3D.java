import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]
        int width = WIDTH/((int)(Math.random()*64)+1); //of boxes
        int xPoint = 0;
        Color boxPurple = new Color(177,69,243);
        while (xPoint < WIDTH-width){
            xPoint += drawPurpleSquare3D(xPoint, width, boxPurple, graphics);
            width += width/2;
        }
    }
    public static int drawPurpleSquare3D(int corner, int sqSide, Color boxPurple, Graphics graphics){
        graphics.setColor(boxPurple);
        graphics.fillRect(corner, corner, sqSide, sqSide);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(corner, corner, sqSide, sqSide);
        return sqSide;
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