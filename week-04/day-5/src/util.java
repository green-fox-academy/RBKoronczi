import java.awt.*;

public class util {

  public static Color getRandomColor(){
    int red = (int) (Math.random()*256);
    int green = (int) (Math.random()*256);
    int blue = (int) (Math.random()*256);
    Color color = new Color(red,green,blue);
    return color;
  }

  public static int aroundHalf(int number) {
    double latitude = getLatitude();
    return (int)Math.round(number*latitude/2);
  }

  public static int aroundQuarter(int number) {
    double latitude = getLatitude();
    return (int)Math.round(number*latitude/4);
  }

  public static int aroundItself(int number){
    double latitude = getLatitude();
    return (int)Math.round(number*latitude);
  }

  private static double getLatitude(){
    return 1 - (Math.random() - 0.5)/5;
  }
}
