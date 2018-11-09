import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Demo {
    public static void mainDraw(Graphics graphics) {
        int paddingX= 10;
        int paddingY= 10;
        int stdWidth = 300;
        int stdHeight = 300;
        for (int i = 1; i <= 4; i++) {
            int stdPaddingX = paddingX * i + stdWidth * (i - 1);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(stdPaddingX, paddingY, stdWidth, stdHeight);
            switch (i) {
                case 1:
                    Triangles.triangles(16, stdPaddingX, paddingY, stdWidth, stdHeight, graphics);
                    break;
                case 2:
                    LinePlay.LinePlay(stdPaddingX, paddingY, stdWidth, stdHeight, graphics);
                    break;
                case 3:
                    for (int j = 0; j < 4; j++){
                        EnvelopeStar.envelopeQuarter(stdPaddingX, paddingY, stdWidth, stdHeight, j, graphics);
                    }
                    break;
                case 4: LinePlayQuarters.LinePlayQuarters(4, stdPaddingX, paddingY, stdWidth, stdHeight, graphics);
            }
            graphics.setColor(Color.BLACK);
            graphics.drawRect((WIDTH-308)/2, 320, 308, 308);
            SuperHexagon.superHexagon(4, (WIDTH-308)/2, 320, 308, 308, graphics);
        }
    }

    // Don't touch the code below
    static int WIDTH = 1280;
    static int HEIGHT = 640;

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