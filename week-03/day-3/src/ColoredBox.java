import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        int[] xPoints = {10, 110, 110, 10};
        int[] yPoints = {10, 10, 110, 110};
        int lastX = xPoints[xPoints.length-1];
        int lastY = yPoints[yPoints.length-1];
        for (int i = 0; i < 4; i++){
            graphics.setColor(new Color(xPoints[i], yPoints[i], xPoints[i]+yPoints[i]));
            graphics.drawLine(lastX, lastY, xPoints[i], yPoints[i]);
            lastX = xPoints[i];
            lastY = yPoints[i];
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