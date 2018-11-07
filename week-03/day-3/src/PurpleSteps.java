import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]
        int number = (int)(Math.random()*64)+1; //of boxes
        int xPoint = 0;
        Color boxPurple = new Color(177,69,243);
        for (int i = 0; i < number; i++){
            xPoint += drawPurpleSquare(xPoint, number, boxPurple, graphics);
        }


    }
    public static int drawPurpleSquare(int corner, int number, Color boxPurple, Graphics graphics){
        int sqSide = WIDTH/number;
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