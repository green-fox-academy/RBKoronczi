import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
  public static void mainDraw(Graphics graphics) {
      recursiveSuperHexagon(8, 0, 0, WIDTH, HEIGHT, graphics);
  }

  public static void recursiveSuperHexagon(int level, int xPos, int yPos, int width, int height, Graphics graphics) {
    int baseNum = level * 2 - 1;
    int sWidth = width/baseNum;
    int sHeight = height/baseNum;
    int sXPos = xPos + width/2 - sWidth/2;
    int sYPos = yPos + height/2 - sHeight/2;
    drawRecursiveSuperHexagon(level, sXPos, sYPos, sWidth, sHeight, graphics);
  }

  public static void drawRecursiveSuperHexagon(int level, int xPos, int yPos, int width, int height, Graphics graphics) {
    graphics.setColor(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
    Hexagon.drawHexagon(xPos, yPos, width, height, graphics);
    if(level == 1) {
    } else {
      drawRecursiveSuperHexagon(level-1, xPos-width+width/4, yPos-height/2, width, height, graphics);
      drawRecursiveSuperHexagon(level-1, xPos, yPos-height, width, height, graphics);
      drawRecursiveSuperHexagon(level-1, xPos+width-width/4, yPos-height/2, width, height, graphics);
      drawRecursiveSuperHexagon(level-1, xPos+width-width/4, yPos+height/2, width, height, graphics);
      drawRecursiveSuperHexagon(level-1, xPos, yPos+height, width, height, graphics);
      drawRecursiveSuperHexagon(level-1, xPos-width+width/4, yPos+height/2, width, height, graphics);
    }
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
