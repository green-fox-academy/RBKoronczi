import java.util.ArrayList;
import java.util.List;

public class Armada {
  List<Ship> armada;

  void addShip(Ship ship) {
    armada.add(ship);
  }

  void fillArmada() {
    armada = new ArrayList<>();
    for (int i = 0; i < Math.round(Math.random()*100); i++){
      Ship ship = new Ship();
      ship.fillShip();
      armada.add(ship);
    }
  }

  boolean war(Armada otherArmada) {
    int thisCounter = this.armada.size();
    int otherCounter = otherArmada.armada.size();
    while (thisCounter != 0 || otherCounter != 0) {
      if (this.armada.get(thisCounter).battle(otherArmada.armada.get(otherCounter))) {
        otherCounter--;
      } else {
        thisCounter--;
      }
    }
    return (thisCounter > otherCounter);
  }
}
