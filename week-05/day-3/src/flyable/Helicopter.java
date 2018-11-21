package flyable;

public class Helicopter extends Vehicle implements Flyable {
  Helicopter(String name) {
    super(name);
  }

  public void fly() {
    System.out.println(this.name + " flies!");
  }

  public void land() {
    System.out.println(this.name + " lands!");
  }

  public void takeOff() {
    System.out.println(this.name + " takes off!");
  }
}
