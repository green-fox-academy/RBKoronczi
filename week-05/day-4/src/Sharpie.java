public class Sharpie {
  String color;
  double width;
  public double inkAmount;

  Sharpie(String color, double width){
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }
  void Use(){
    inkAmount--;
  }
}
