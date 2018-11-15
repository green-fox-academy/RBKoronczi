import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalTriangles {
  public static void mainDraw(Graphics graphics){
    int xPos = 0;
    int yPos = 0;
    int width = WIDTH * 9 / 10;
    int height = HEIGHT * 9 / 10;
    drawFractalTriangle(7, xPos, yPos, util.aroundItself(width), util.aroundItself(height), graphics);
  }


  public static void drawFractalTriangle(int level, int xPos, int yPos, int width, int height, Graphics graphics) {
    graphics.setColor(util.getRandomColor());
    drawTriangle(xPos, yPos, width, height, graphics);
    if (level > 1) {
      drawFractalTriangle(level - 1, xPos, yPos, width / 2, height / 2, graphics);
      drawFractalTriangle(level - 1, xPos + width / 2, yPos, width / 2, height / 2, graphics);
      drawFractalTriangle(level - 1, xPos + width / 4, yPos + height / 2, width / 2, height / 2, graphics);
    }
  }

  public static void drawTriangle(int xPos, int yPos, int width, int height, Graphics graphics){
    int[] xPoints = {xPos, xPos + width, xPos + width/2};
    int[] yPoints = {yPos, yPos, yPos + height};
    graphics.drawPolygon(xPoints, yPoints, 3);
  }


  // Don't touch the code below
  static int WIDTH = 512;
  static int HEIGHT = 512;

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
