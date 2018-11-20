package Garden;

public class Main {
  public static void main(String[] args) {
    Garden myGarden = new Garden();
    Flower yellow = new Flower("yellow");
    Flower blue = new Flower("blue");
    Tree purple = new Tree("purple");
    Tree orange = new Tree("orange");
    myGarden.addPlant(yellow);
    myGarden.addPlant(blue);
    myGarden.addPlant(purple);
    myGarden.addPlant(orange);

    myGarden.printStatus();
    System.out.println();
    myGarden.water(40);
    myGarden.printStatus();
    System.out.println();
    myGarden.water(70);
    myGarden.printStatus();
  }
}
