import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.isDefaultLookAndFeelDecorated;

public class Squares {
  public static void mainDraw(Graphics graphics) {
    drawSquares(5, 0, 0, HEIGHT, WIDTH, graphics);
  }

  public static void drawSquares(int level, int xPos, int yPos, int width, int height, Graphics graphics){
    if (level == 1){
      graphics.drawRect(xPos, yPos, width, height);
    } else {
      int sWidth = Math.round(width/3);
      int sHeight = Math.round(height/3);
      graphics.drawRect(xPos, yPos, width, height);
      drawSquares(level-1, xPos+sWidth, yPos, sWidth, sHeight, graphics);
      drawSquares(level-1, xPos, yPos+sHeight, sWidth, sHeight, graphics);
      drawSquares(level-1, xPos+sWidth*2, yPos+sHeight, width-sWidth*2, sHeight, graphics);
      drawSquares(level-1, xPos+sWidth, yPos+sHeight*2, sWidth, height-sHeight*2, graphics);
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
    panel.setBackground(Color.YELLOW);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
