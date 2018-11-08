import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        LinePlay(0, 0, WIDTH, HEIGHT, graphics);
    }
    public static void LinePlay(int startX, int startY, int drawWidth, int drawHeight, Graphics graphics){
        int drawIntensity = 15;
            for (int i = 0; i < drawIntensity; i++){
                int firstX = startX + 0;
                int firstY = startY + drawHeight/drawIntensity*i;
                int secondX = startX + drawWidth/drawIntensity*i;
                int secondY = startY + drawHeight;
                graphics.setColor(Color.GREEN);
                graphics.drawLine(firstX, firstY, secondX, secondY);
                firstX += drawWidth;
                firstY = startY + drawHeight - drawHeight/drawIntensity*i;
                secondX = firstX - drawWidth/drawIntensity*i;
                secondY = startY;
                graphics.setColor(Color.MAGENTA);
                graphics.drawLine(firstX, firstY, secondX, secondY);
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