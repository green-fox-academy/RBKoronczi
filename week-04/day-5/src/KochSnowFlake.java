import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class KochSnowFlake {
  public static void mainDraw(Graphics graphics){
    drawKochSnowFlake(10, 100, 100, 400, graphics);
  }

  public static void drawKochSnowFlake(int level, int xPos, int yPos, int sideLength, Graphics graphics){
    KochLine.drawKochLine(level, xPos + sideLength/2, yPos, sideLength, 120, graphics);
    int y2 = (int)(sideLength * Math.sin(Math.toRadians(120)));
    KochLine.drawKochLine(level, xPos, yPos + y2, sideLength, 0, graphics);
    KochLine.drawKochLine(level, xPos + sideLength, yPos + y2, sideLength, 240, graphics);

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
