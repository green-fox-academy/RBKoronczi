import java.sql.SQLOutput;
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
    System.out.println("The sizes of the armadas are: " + (thisCounter + 1) + " and " + (otherCounter + 1) + ".");
    System.out.println();
    do {
      String thisShipName = this.armada.get(thisCounter).name.shipName;
      String otherShipName = otherArmada.armada.get(otherCounter).name.shipName;
      System.out.println(thisShipName + " fights " + otherShipName + ".");
      if (this.armada.get(thisCounter).battle(otherArmada.armada.get(otherCounter))) {
        otherCounter--;
      } else {
        thisCounter--;
      }
      System.out.println(
          "There's " + (thisCounter + 1) + " ships left in the first armada," +
              " and " + (otherCounter + 1) + " left in the second"
      );
      System.out.println();
    } while (thisCounter >= 0 && otherCounter >= 0);
    return (thisCounter > otherCounter);
  }
}
