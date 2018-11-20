package garden;

public class Plant {
  String color;
  double waterLevel;
  double necessaryWaterLevel;
  double waterEfficiency;

  Plant(String color, double necessaryWaterLevel, double waterEfficiency) {
    this.color = color;
    this.waterLevel = 0;
    this.necessaryWaterLevel = necessaryWaterLevel;
    this.waterEfficiency = waterEfficiency;
  }

  boolean needsWater() {
    return (necessaryWaterLevel > waterLevel);
  }

  void waterPlant(double waterAmount) {
    waterLevel += waterAmount * waterEfficiency;
  }

  String getStatus() {
    String result = "The " + color + " " + getType();
    if(needsWater()) {
      result += " needs water";
    } else {
      result += " doesn't need water";
    }
    return result;
  }

  String getType() {
    return "Plant";
  }
}
