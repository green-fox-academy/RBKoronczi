public class BattleApp {
  public static void main(String[] args) {
    Ship dauntless = new Ship("Dauntless");
    Ship intrepid = new Ship("Intrepid");
    dauntless.fillShip();
    intrepid.fillShip();
    if (dauntless.battle(intrepid)) {
      System.out.println("Status of the Intrepid: ");
      intrepid.represent();
    } else {
      System.out.println("Status of the Dauntless: ");
      dauntless.represent();
    }
  }
}
