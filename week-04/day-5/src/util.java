import java.awt.*;

public class util {

  public static Color getRandomColor(){
    int red = (int) (Math.random()*256);
    int green = (int) (Math.random()*256);
    int blue = (int) (Math.random()*256);
    Color color = new Color(red,green,blue);
    return color;
  }
}
