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
    int totalDamage = 0;
    for(Aircraft plane : aircrafts) {
      totalDamage += plane.fight();
    }
    otherCarrier.healthPoints -= totalDamage;
  }

  String getStatus() {
    if(healthPoints <= 0) {
      return "It's dead Jim! :(";
    }
    String aircraftStatuses = "";
    int totalDamage = 0;
    if(aircrafts.size() == 0) {
      aircraftStatuses = "<none>" + System.lineSeparator();
    }
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
