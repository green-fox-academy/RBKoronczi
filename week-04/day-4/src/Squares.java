import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
  public static void mainDraw(Graphics graphics) {
    drawSquares(4, 0, 0, WIDTH, HEIGHT, graphics);
  }

  public static void drawSquares(int level, int xPos, int yPos, int width, int height, Graphics graphics){
    if (level == 1){
      graphics.drawRect(xPos, yPos, width, height);
    } else {
      graphics.drawRect(xPos, yPos, width, height);
      drawSquares(level-1, xPos+width/3, yPos, width/3, height/3, graphics);
      drawSquares(level-1, xPos, yPos+height/3, width/3, height/3, graphics);
      drawSquares(level-1, xPos+width/3*2, yPos+height/3, width/3, height/3, graphics);
      drawSquares(level-1, xPos+width/3, yPos+width/3*2, width/3, height/3, graphics);
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
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
