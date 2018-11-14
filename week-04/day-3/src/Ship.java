import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> crew;
  Pirate captain;

   void fillShip() {
     this.crew = new ArrayList<>();
     this.captain = new Pirate();
     long crewSize = Math.round(Math.random()*100);
     for (long i = 0; i < crewSize; i++) {
       crew.add(new Pirate());
     }
  }

  void represent() {
    System.out.printf("The Captain drank " + captain.intoxication + " kegs of rum");
     if (captain.isAlive) {
      if (captain.isConscious) {
        System.out.printf("and he's alive.");
      }
       System.out.printf("and he's unconscious.");
    }
    System.out.printf("and he's dead.");
    int crewAlive = this.getCrewAlive();
    System.out.println("There's " + crewAlive + " pirates alive on this ship!");
  }

  boolean battle(Ship otherShip) {
     boolean outcome = this.calculateScore() > otherShip.calculateScore();
    if (outcome) {
      otherShip.battleLoss();
      this.party();
    } else {
      this.battleLoss();
      otherShip.party();
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
     for (Pirate pirate : this.crew){
       boolean dies = (Math.random() < 0.5);
       if (dies){
         pirate.die();
       }
     }
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
