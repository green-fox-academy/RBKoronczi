package Garden;

public class Plant {
  String color;
  double waterLevel;
  double needsWater;
  double waterEfficiency;

  Plant() {
    this("green", 0,100);
  }

  Plant(String color, double needsWater, double waterEfficiency) {
    this.color = color;
    this.waterLevel = 0;
    this.needsWater = needsWater;
    this.waterEfficiency = waterEfficiency;
  }
}
