import javax.swing.*;
import java.awt.*;

import static java.awt.Window.getOwnerlessWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {
        superHexagon(8, 0, 0, WIDTH, HEIGHT, graphics);
    }
    public static void superHexagon(int sides, int initX, int initY, int width, int height, Graphics graphics){
        int baseNum = 2*sides-1;
        int heightOf = height/(baseNum);
        int sideOf = width/(3*sides-1);
        int halfSide = sideOf/2;
        int tiles = sides-1;
        for (int i = 0; i < baseNum; i++){
            if (i < sides){
                tiles++;
            } else  {
                tiles--;
            }
            for (int j = 0; j < tiles; j++){
                int pos[] = getTilePos(i, j, initX, initY, sides, sideOf, halfSide, heightOf);
                drawHexagon(pos[0], pos[1], heightOf, sideOf, graphics);
            }
        }
    }
    public static int[] getTilePos(int i, int j, int initX, int initY, int sides, int sideOf, int halfSide, int heightOf){
        int posX = initX + sideOf + ((halfSide + sideOf) * i);
        int posY;
        if (i < sides) {
            posY = initY + (sides - i + j * 2) * heightOf / 2;
        } else  {
            posY = initY + (i - sides + 2 + 2 * j) * heightOf / 2;
        }
        int[] result = {posX, posY};
        return result;
    }

    public static void drawHexagon(int xPos, int yPos, int height, int side, Graphics graphics){
        int[][] points = getHexagonPoints(xPos, yPos, height, side);
        graphics.drawPolygon(points[0], points[1], 6);
    }
    public static int[][] getHexagonPoints (int xPos, int yPos, int height, int side){
        int halfSide = side/2;
        int halfHeight = height/2;
        int result[][] = new int[2][6];
        result[0][0]=xPos-halfSide;
        result[1][0]=yPos-halfHeight;
        result[0][1]=xPos+halfSide;
        result[1][1]=yPos-halfHeight;
        result[0][2]=xPos+side;
        result[1][2]=yPos;
        result[0][3]=xPos+halfSide;
        result[1][3]=yPos+halfHeight;
        result[0][4]=xPos-halfSide;
        result[1][4]=yPos+halfHeight;
        result[0][5]=xPos-side;
        result[1][5]=yPos;
        return result;
    }




    // Don't touch the code below
    static int WIDTH = 320*2;
    static int HEIGHT = 320*2;

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