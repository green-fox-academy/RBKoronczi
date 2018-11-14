import java.util.ArrayList;
import java.util.List;

public class Ship {
  ShipName name;
  Pirate captain;
  List<Pirate> crew;

  Ship() {
    this.name = new ShipName();
  }

  Ship(String shipName) {
    this.name = new ShipName(shipName);
  }

  void fillShip() {
    this.captain = new Pirate();
    this.crew = new ArrayList<>();
    long crewSize = Math.round(Math.random() * 100);
    for (long i = 0; i < crewSize; i++) {
      crew.add(new Pirate());
    }
  }

  void represent() {
    System.out.printf("The Captain drank " + captain.intoxication + " kegs of rum");
    if (captain.isAlive) {
      if (captain.isConscious) {
        System.out.printf(" and he's still alive.");
      } else {
        System.out.printf(" and he's unconscious.");
      }
    } else {
      System.out.printf(" and he's dead.");
    }
    System.out.println();
    int crewAlive = this.getCrewAlive();
    System.out.println("There's " + crewAlive + " pirates alive on this ship.");
  }

  boolean battle(Ship otherShip) {
    boolean outcome = this.calculateScore() > otherShip.calculateScore();
    if (outcome) {
      battleEffects(otherShip);
    } else {
      otherShip.battleEffects(this);
    }
    return outcome;
  }

  boolean battle(Ship otherShip, boolean isAdvanced) {
    if(isAdvanced) {
      boolean outcome = this.advancedCalculateScore() > otherShip.advancedCalculateScore();
      if (outcome) {
        battleEffects(otherShip);
      } else {
        otherShip.battleEffects(this);
      }
      return outcome;
    } else {
      return battle(otherShip);
    }
  }

  private int calculateScore() {
    int score = this.getCrewAlive() - this.captain.intoxication;
    return score;
  }

  private int advancedCalculateScore() {
    int score = this.getCrewConscious();
    if(captain.isAlive) {
      if (captain.isConscious) {
        score -= captain.intoxication;
      } else {
        score /= 2;
      }
    } else {
      score = 0;
    }
      return score;
  }

  private void battleEffects(Ship otherShip) {
    otherShip.battleLoss();
    this.party();
    System.out.println(this.name.shipName + " won!");
    this.represent();
  }

  private int getCrewAlive() {
    int crewAlive = 0;
    for (Pirate pirate : crew) {
      if (pirate.isAlive) {
        crewAlive++;
      }
    }
    return crewAlive;
  }

  private int getCrewConscious() {
    int crewConscious = 0;
    for (Pirate pirate : crew) {
      if (pirate.isConscious) {
        crewConscious++;
      }
    }
    return crewConscious;
  }

  private void battleLoss() {
    if (getRandomBoolean()) {
      this.captain.die();
    }
    for (Pirate pirate : this.crew) {
      if (getRandomBoolean()) {
        pirate.die();
      }
    }
  }

  boolean getRandomBoolean() {
    return Math.random() < 0.5;
  }

  private void party() {
    drinkRandomRum(this.captain);
    for (Pirate pirate : this.crew) {
      drinkRandomRum(pirate);
    }
  }

  private void drinkRandomRum(Pirate pirate) {
    for (int i = 0; i < Math.round(Math.random() * 10); i++) {
      pirate.drinkSomeRum();
    }
  }
}
