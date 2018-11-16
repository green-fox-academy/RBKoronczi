import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  public static void mainDraw(Graphics graphics){
    sierpinskyCarpet(5, 5, 5, 729, 729, graphics);
  }

  public static void sierpinskyCarpet(int level, int xPos, int yPos, int width, int height, Graphics graphics){
    int newWidth = width/3;
    int newHeight = height/3;
    graphics.setColor(util.getRandomColor());
    graphics.fillRect(xPos + newWidth, yPos + newHeight, newWidth, newHeight);
    if (level>0){
      sierpinskyCarpet(level-1, xPos, yPos, newWidth, newHeight, graphics);
      sierpinskyCarpet(level-1, xPos + newWidth, yPos, newWidth, newHeight, graphics);
      sierpinskyCarpet(level-1, xPos + newWidth * 2, yPos, newWidth, newHeight, graphics);
      sierpinskyCarpet(level-1, xPos + newWidth * 2, yPos + newHeight, newWidth, newHeight, graphics);
      sierpinskyCarpet(level-1, xPos + newWidth * 2, yPos + newHeight * 2, newWidth, newHeight, graphics);
      sierpinskyCarpet(level-1, xPos + newWidth, yPos + newHeight * 2, newWidth, newHeight, graphics);
      sierpinskyCarpet(level-1, xPos, yPos + newHeight * 2, newWidth, newHeight, graphics);
      sierpinskyCarpet(level-1, xPos, yPos + newHeight, newWidth, newHeight, graphics);
    }
  }

  // Don't touch the code below
  static int WIDTH = 740;
  static int HEIGHT = 740;

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
