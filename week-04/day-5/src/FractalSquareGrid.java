import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalSquareGrid {
  public static void mainDraw(Graphics graphics){
    fractalSquareGrid(4, 10, 10, 512, 512, graphics);
  }

  public static void fractalSquareGrid(int level, int xPos, int yPos, int width, int height, Graphics graphics){
    int newWidth = width/2;
    int newHeight = height/2;
    int widthInc = (int) (newWidth * 0.05);
    int heighthInc = (int) (newHeight * 0.05);
    graphics.setColor(util.getRandomColor());
    graphics.fillRect(
        xPos + newWidth/2 - widthInc, yPos + newHeight/2 - heighthInc,
        newWidth + widthInc * 2, heighthInc * 2
    );
    graphics.fillRect(
        xPos + newWidth/2 * 3 - widthInc, yPos + newHeight/2 - heighthInc,
        widthInc * 2, newHeight + heighthInc * 2
    );
    graphics.fillRect(
        xPos + newWidth/2 - widthInc, yPos + newHeight/2 * 3 - heighthInc,
        newWidth + widthInc * 2, heighthInc * 2
    );
    graphics.fillRect(
        xPos + newWidth/2 - widthInc, yPos + newHeight/2 - heighthInc,
        widthInc * 2, newHeight + heighthInc * 2
    );

    if (level > 0) {
      fractalSquareGrid(level-1, xPos, yPos, newWidth, newHeight, graphics);
      fractalSquareGrid(level-1, xPos + newWidth, yPos, newWidth, newHeight, graphics);
      fractalSquareGrid(level-1, xPos + newWidth, yPos + newHeight, newWidth, newHeight, graphics);
      fractalSquareGrid(level-1, xPos, yPos + newHeight, newWidth, newHeight, graphics);
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
