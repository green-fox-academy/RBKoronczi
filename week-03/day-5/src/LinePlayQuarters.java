import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        LinePlayQuarters(16, 0, 0, WIDTH, HEIGHT, graphics);

    }
    public static void LinePlayQuarters(int numberOfQuarters, int initX, int initY, int width, int height, Graphics graphics) {
        int sqrNum = (int) (Math.sqrt(numberOfQuarters));
        int quarterWidth = width / numberOfQuarters * sqrNum;
        int quarterHeight = height / numberOfQuarters * sqrNum;
        for (int i = 0; i < numberOfQuarters / sqrNum; i++) {
            for (int j = 0; j < numberOfQuarters / sqrNum; j++) {
                LinePlay.LinePlay(i * quarterWidth + initX, j * quarterHeight + initY, quarterWidth, quarterHeight, graphics);
            }
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