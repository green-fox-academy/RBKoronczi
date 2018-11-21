package flyable;

public abstract class Vehicle {
  String name;
  int mileage;
  int fuel;

  Vehicle(String name) {
    this(name, 0, 0);
  }

  Vehicle(String name, int mileage, int fuel) {
    this.name = name;
    this.mileage = mileage;
    this.fuel = fuel;
  }
}
