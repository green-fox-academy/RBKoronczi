import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> crew;
  Pirate captain;
  ShipName name;

   void fillShip() {
     this.crew = new ArrayList<>();
     this.captain = new Pirate();
     long crewSize = Math.round(Math.random()*100);
     for (long i = 0; i < crewSize; i++) {
       crew.add(new Pirate());
     }
     this.name = new ShipName();
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
      otherShip.battleLoss();
      this.party();
      System.out.println(this.name.shipName + " won!");
      this.represent();
    } else {
      this.battleLoss();
      otherShip.party();
      System.out.println(otherShip.name.shipName + " won!");
      otherShip.represent();
    }
    return outcome;
  }

  private int getCrewAlive() {
    int crewAlive = 0;
    for (Pirate pirate: crew) {
      if (pirate.isAlive) {
        crewAlive++;
      }
    }
     return crewAlive;
  }

  private int calculateScore() {
     int score = this.getCrewAlive() - this.captain.intoxication;
     return score;
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
    for(int i = 0; i < Math.round(Math.random()*10); i++) {
      pirate.drinkSomeRum();
    }
  }
}
