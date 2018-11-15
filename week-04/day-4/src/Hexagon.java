import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.isDefaultLookAndFeelDecorated;

public class Hexagon {
  public static void mainDraw(Graphics graphics) {
    recursiveHexagon(5, 0, 0, WIDTH, HEIGHT, graphics);
  }

  public static void recursiveHexagon(int level, int xPos, int yPos, int width, int height, Graphics graphics){
    drawHexagon(xPos, yPos, width, height, graphics);
    if (level == 0){
    } else {
      recursiveHexagon(level-1, xPos + width/8, yPos, width/2, height/2, graphics);
      recursiveHexagon(level-1, xPos + width/8, yPos+height/2, width/2, height/2, graphics);
      recursiveHexagon(level-1, xPos + width/2, yPos+height/4, width/2, height/2, graphics);
    }
  }

  public static void drawHexagon(int xPos, int yPos, int width, int height, Graphics graphics) {
    int coordinates[][] = getHexagonCoordinates(xPos, yPos, width, height);
    graphics.drawPolygon(coordinates[0], coordinates[1], 6);
  }

  public static int[][] getHexagonCoordinates(int xPos, int yPos, int width, int height){
    int[][] coordinates = new int[2][6];
    coordinates[0][0] = xPos + width/4;
    coordinates[1][0] = yPos;
    coordinates[0][1] = xPos + width - width/4;
    coordinates[1][1] = yPos;
    coordinates[0][2] = xPos + width;
    coordinates[1][2] = yPos + height/2;
    coordinates[0][3] = coordinates[0][1];
    coordinates[1][3] = yPos + height;
    coordinates[0][4] = coordinates[0][0];
    coordinates[1][4] = yPos +height;
    coordinates[0][5] = xPos;
    coordinates[1][5] = coordinates[1][2];
    return coordinates;
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
