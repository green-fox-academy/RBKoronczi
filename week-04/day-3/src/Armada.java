import java.util.ArrayList;
import java.util.List;

public class Armada {
  List<Ship> armada;

  void fillArmada() {
    armada = new ArrayList<>();
    for (int i = 0; i < Math.round(Math.random() * 100); i++) {
      Ship ship = new Ship();
      ship.fillShip();
      armada.add(ship);
    }
  }

  boolean war(Armada otherArmada) {
    int thisCounter = this.armada.size() - 1;
    int otherCounter = otherArmada.armada.size() - 1;
    while (thisCounter > 0 && otherCounter > 0) {
      System.out.println("Ship first." + thisCounter + " fights Ship second." + otherCounter);
      if (this.armada.get(thisCounter).battle(otherArmada.armada.get(otherCounter))) {
        otherCounter--;
        System.out.println("first." + thisCounter + " Won!");
        this.armada.get(thisCounter).represent();
      } else {
        thisCounter--;
        System.out.println("second." + otherCounter + " Won!");
        otherArmada.armada.get(otherCounter).represent();
      }
      System.out.println();
    }
    return (thisCounter > otherCounter);
  }
}
