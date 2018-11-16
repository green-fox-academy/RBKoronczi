import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalTree {
  public static void mainDraw(Graphics graphics){
    drawFractalTree(10, 20, 600, 600, graphics);
  }

  public static void drawFractalTree(int level, int xPos, int yPos, int lengthish, Graphics graphics) {
    int length =(int)( lengthish/5);
      drawFractalTree(level, xPos + lengthish/2, yPos, length, 270, graphics);
  }

  public static void drawFractalTree(int level, int xPos, int yPos, int length, int angle, Graphics graphics){
    graphics.setColor(util.getRandomColor());
    int x2 = (int)(length * Math.cos(Math.toRadians(angle))) + xPos;
    int y2 = (int)(length * Math.sin(Math.toRadians(angle))) + yPos;
    graphics.drawLine(xPos, yPos, x2, y2);
    if (level > 1){
      for(int i = 0; i < getRandomBranches(); i++) {
        if (i % 2 == 1) {
          drawFractalTree(
              level - 1, x2, y2,
              util.aroundHalf(length) + util.aroundQuarter(length),
              angle + (util.aroundHalf(30) * i),
              graphics
          );
        }
        drawFractalTree(
            level - 1, x2, y2,
            util.aroundHalf(length)+ util.aroundQuarter(length),
            angle - (util.aroundHalf(30) * i),
            graphics
        );
      }
    }

  }
  public static int getRandomBranches(){
    return (int)(Math.random()*5) + 1;
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
