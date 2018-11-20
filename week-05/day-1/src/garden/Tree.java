package garden;

public class Tree extends Plant {
  Tree(String color) {
    super(color,  10, 0.40);
  }

  String getType() {
    return "Tree";
  }
}
