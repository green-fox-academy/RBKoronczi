import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class KochLine {
  public static void mainDraw(Graphics graphics){
      drawKochLine(10, 10, 10, 600, 0, graphics);
  }

  public static void drawKochLine(int level, int xStart, int yStart, int length, int angle, Graphics graphics){
    int x2 = (int)(length * Math.cos(Math.toRadians(angle)));
    int y2 = (int)(length * Math.sin(Math.toRadians(angle)));
    if (level == 1) {
      graphics.drawLine(xStart, yStart, xStart + x2, yStart + y2);
    } else {
      drawKochLine(level -1, xStart, yStart, length/3, angle, graphics);
      drawKochLine(level -1, xStart + x2 / 3, yStart + y2 / 3, length/3, angle + 60, graphics);
      int x3 = x2 / 3 + (int)(length / 3 * Math.cos(Math.toRadians(angle + 60)));
      int y3 = y2 / 3 + (int)(length / 3 * Math.sin(Math.toRadians(angle + 60)));
      drawKochLine(level -1, xStart + x3, yStart + y3, length/3, angle - 60, graphics);
      drawKochLine(level -1, xStart + x2 * 2 / 3, yStart + y2 * 2 / 3, length/3, angle, graphics);
    }

  }

  // Don't touch the code below
  static int WIDTH = 640;
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
    panel.setBackground(Color.WHITE);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
