package aircraftcarrier;

public class Main {
  public static void main(String[] args) {
    AircraftCarrier enterprise = new AircraftCarrier(2500, 5000);
    AircraftCarrier avalon = new AircraftCarrier(1000, 105000);

    for (int i = 0; i < 3; i++) {
      enterprise.add(new F35());
      enterprise.add(new F16());
    }

    System.out.println(enterprise.getStatus());
    System.out.println(avalon.getStatus());
    System.out.println();
    try {
      while (avalon.healthPoints > 0) {
        enterprise.fill();
        System.out.println(enterprise.getStatus());
        System.out.println();
        enterprise.fight(avalon);
        System.out.println("Enemy Status:");
        System.out.println(avalon.getStatus());
        System.out.println();
      }
    } catch (Exception e) {
      System.out.println("We're out of Ammo!");
    }
  }
}
