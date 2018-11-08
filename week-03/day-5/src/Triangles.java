import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        Triangles(16, 0, 0, WIDTH, HEIGHT, graphics);
    }
    public static void Triangles (int lines, int startX, int startY, int width, int height, Graphics graphics){
        int heightInc = height/lines;
        int widthInc = width/lines;
        for(int i = 0; i < lines; i++){
            int[][] points = new int[i+1][2];
            for (int j = 0; j < points.length; j++){
                if (j == 0) {
                    points[j][0] = width/2 - widthInc/2*i + startX;
                } else {
                    points[j][0] = points[j-1][0] +widthInc;
                }
                points[j][1] = heightInc*i + startY;
                if (i != 0){
                    if (j == 0){
                        graphics.drawLine(points[j][0], points[j][1], points[j][0]+widthInc, points[j][1]);
                        graphics.drawLine(points[j][0], points[j][1], points[j][0]+widthInc/2, points[j][1]-heightInc);
                    } else if (j == points.length-1){
                        graphics.drawLine(points[j][0], points[j][1], points[j][0]-widthInc/2, points[j][1]-heightInc);
                    } else {
                        graphics.drawLine(points[j][0], points[j][1], points[j][0]-widthInc/2, points[j][1]-heightInc);
                        graphics.drawLine(points[j][0], points[j][1], points[j][0]+widthInc, points[j][1]);
                        graphics.drawLine(points[j][0], points[j][1], points[j][0]+widthInc/2, points[j][1]-heightInc);
                    }
                }
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