import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < 4; i++){
            envelopeQuarter(0, 0, WIDTH, HEIGHT, i, graphics);
        }
    }

    public static void envelopeQuarter(int startX, int startY, int drawWidth, int drawHeight, int quarter, Graphics graphics) {
        int drawIntensity = 15;
        drawWidth /= 2;
        drawHeight /= 2;
        for (int i = 0; i < drawIntensity; i++) {
            int firstX =0;
            int firstY =0;
            int secondX =0;
            int secondY =0;
            if(quarter == 0){
                firstX = startX + drawWidth;
                firstY = startY + drawHeight / drawIntensity * i;
                secondX = startX + drawWidth - drawWidth / drawIntensity * i;
                secondY = startY + drawHeight;
            } else if (quarter == 1){
                firstX = startX + drawWidth;
                firstY = startY + drawHeight / drawIntensity * i;
                secondX = startX + drawWidth + drawWidth / drawIntensity * i;
                secondY = startY + drawHeight;
            } else if (quarter == 2) {
                firstX = startX + drawWidth;
                firstY = startY + drawHeight*2 - drawHeight / drawIntensity * i;
                secondX = startX + drawWidth - drawWidth / drawIntensity * i;
                secondY = startY + drawHeight;
            } else if (quarter == 3) {
                firstX = startX + drawWidth;
                firstY = startY + drawHeight*2 - drawHeight / drawIntensity * i;
                secondX = startX + drawWidth + drawWidth / drawIntensity * i;
                secondY = startY + drawHeight;
            }
            graphics.setColor(Color.GREEN);
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