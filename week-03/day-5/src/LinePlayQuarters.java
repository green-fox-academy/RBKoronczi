import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        int numberOf = 16;
        int sqrNum = (int)(Math.sqrt(numberOf));
        int widthOf = WIDTH/numberOf*sqrNum;
        int heightOf = HEIGHT/numberOf*sqrNum;
        for (int i = 0; i < numberOf/sqrNum; i++){
            for (int j = 0; j < numberOf/sqrNum; j++){
                LinePlay.LinePlay(i*widthOf, j*heightOf, widthOf, heightOf, graphics);
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