package garden;

public class Flower extends Plant {
  Flower(String color) {
    super(color, 5, 0.75);
  }

  String getType() {
    return "Flower";
  }
}
