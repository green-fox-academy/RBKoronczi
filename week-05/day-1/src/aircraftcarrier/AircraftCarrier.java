package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier {
  List<Aircraft> aircrafts;
  int ammo;
  int healthPoints;

  AircraftCarrier(int ammo, int healthPoints) {
    aircrafts = new ArrayList<>();
    this.ammo = ammo;
    this.healthPoints = healthPoints;
  }

  void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

  void fill() throws Exception {
    if (this.ammo == 0) {
      throw new Exception("There's no ammo");
    }
    for (Aircraft plane : aircrafts) {
      if (plane.isPriority()) {
        this.ammo = plane.refill(this.ammo);
      }
    }
    for (Aircraft plane : aircrafts) {
      this.ammo = plane.refill(this.ammo);
    }
  }

  void fight(AircraftCarrier otherCarrier) {
    int TotalDamage = 0;
    for(Aircraft plane : aircrafts) {
      TotalDamage += plane.fight();
    }
    otherCarrier.healthPoints -= TotalDamage;
  }

  String getStatus() {
    String aircraftStatuses = "";
    int totalDamage = 0;
    for(Aircraft plane : aircrafts) {
      totalDamage += plane.ammo * plane.damage;
      aircraftStatuses += plane.getStatus() + System.lineSeparator();
    }
    return "HP: " + healthPoints
        + ", Aircraft Count: " + aircrafts.size()
        + ", Ammo Storage: " + ammo
        + ", Total Damage: " +  totalDamage
        + System.lineSeparator()
        + "Aircrafts: "
        + System.lineSeparator()
        + aircraftStatuses;
  }
}
