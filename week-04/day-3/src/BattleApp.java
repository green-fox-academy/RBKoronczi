public class BattleApp {
  public static void main(String[] args) {
    Ship dauntless = new Ship();
    Ship intrepid = new Ship();
    dauntless.fillShip();
    intrepid.fillShip();
    if(dauntless.battle(intrepid)){
      System.out.println("The Dauntless Won!");
    } else {
      System.out.println("The Intrepid Won!");
    }
    System.out.println("Status of the Dauntless: ");
    dauntless.represent();
    System.out.println();
    System.out.println("Status of the Intrepid: ");
    intrepid.represent();
  }
}
